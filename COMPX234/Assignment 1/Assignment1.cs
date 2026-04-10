using System;
using System.Collections.Generic;
using System.Security.Principal;
using System.Threading;

class Assignment1
{
    // Simulation initialisation
    private static int NUM_MACHINES = 50;
    private static int NUM_PRINTERS = 5;
    private static int SIMULATION_TIME = 30;
    private static int MAX_PRINTER_SLEEP = 3;
    private static int MAX_MACHINE_SLEEP = 5;
    private static volatile bool sim_active = true;

    // Shared print queue
    printList list = new printList();

    // Synchronisation tools
    static Mutex accessLock = new Mutex();
    static Semaphore availableSpace = new Semaphore(5, 5); // Tracks empty slots in the queue
    static Semaphore jobsQueue = new Semaphore(0, 5); // Tracks jobs waiting to be printed

    public void StartSimulation()
    {
        // Lists to hold references to threads
        List<Thread> mThreads = new List<Thread>();
        List<Thread> pThreads = new List<Thread>();

        // Create and start machine threads
        for (int i = 0; i < NUM_MACHINES; i++)
        {
            int id = i;
            Thread t = new Thread(() =>
            {
                new MachineThread(this, id).InitialiseMachine();
            });
            mThreads.Add(t);
            t.Start();
        }

        // Create and start printer threads
        for (int i = 0; i < NUM_PRINTERS; i++)
        {
            int id = i;
            Thread t = new Thread(() =>
            {
                new PrinterThread(this, id).InitialisePrinter();
            });
            pThreads.Add(t);
            t.Start();
        }

        // Run simulation for set duration
        Sleep(SIMULATION_TIME);

        // Stop simulation loop
        sim_active = false;

        // Join all threads to ensure clean exit
        foreach (var t in pThreads)
        {
            t.Join();
        }
        foreach (var t in mThreads)
        {
            t.Join();
        }
    }

    public class PrinterThread
    {
        private readonly Assignment1 outer;
        private int printerID;

        public PrinterThread(Assignment1 parent, int id)
        {
            outer = parent;
            printerID = id;
        }

        public void InitialisePrinter()
        {
            while (sim_active)
            {
                PrinterSleep();
                PrintDox(printerID);
            }
        }

        public void PrinterSleep()
        {
            // Random delay between 1 and MAX_PRINTER_SLEEP
            int sleepSeconds =
                1
                + (int)(new Random(Guid.NewGuid().GetHashCode()).NextDouble() * MAX_PRINTER_SLEEP);

            try
            {
                Thread.Sleep(sleepSeconds * 1000);
            }
            catch (ThreadInterruptedException)
            {
                Console.WriteLine("Sleep Interrupted");
            }
        }

        public void PrintDox(int printerID)
        {
            while (sim_active)
            {
                // Wait for a job to be available in the queue
                if (jobsQueue.WaitOne(100))
                {
                    accessLock.WaitOne(); // Secure exclusive access to queue

                    Console.WriteLine("Printer ID:" + printerID + " : now available");
                    List.queuePrint(List, printerID); // Process the job

                    accessLock.ReleaseMutex();
                    availableSpace.Release(); // Signal that a slot in the queue is now free
                    return;
                }
            }
        }

        private printList List
        {
            get { return outer.list; }
        }
    }

    public class MachineThread
    {
        private readonly Assignment1 outer;
        private int machineID;

        public MachineThread(Assignment1 parent, int id)
        {
            outer = parent;
            machineID = id;
        }

        public void InitialiseMachine()
        {
            while (sim_active)
            {
                MachineSleep();

                // Request access and send job if space is available
                if (IsRequestSafe(machineID))
                {
                    PrintRequest(machineID);
                    PostRequest(machineID);
                }
            }
        }

        public bool IsRequestSafe(int id)
        {
            Console.WriteLine("Machine " + id + " Checking availability");

            while (sim_active)
            {
                // Check if queue has room
                if (availableSpace.WaitOne(100))
                {
                    accessLock.WaitOne(); // Lock queue for writing
                    Console.WriteLine("Machine " + id + " will proceed");
                    return true;
                }
            }
            return false;
        }

        public void PrintRequest(int id)
        {
            Console.WriteLine("Machine " + id + " Sending a print request");
            printDoc doc = new printDoc("My name is machine " + id, id);

            // Add document to the shared queue
            outer.list = outer.list.queueInsert(outer.list, doc);
        }

        public void PostRequest(int id)
        {
            Console.WriteLine("Machine " + id + " Releasing binary semaphore");
            accessLock.ReleaseMutex();
            jobsQueue.Release(); // Signal that a new job is ready for printing
        }

        public void MachineSleep()
        {
            int sleepSeconds =
                1
                + (int)(new Random(Guid.NewGuid().GetHashCode()).NextDouble() * MAX_MACHINE_SLEEP);

            try
            {
                Thread.Sleep(sleepSeconds * 1000);
            }
            catch (ThreadInterruptedException)
            {
                Console.WriteLine("Sleep Interrupted");
            }
        }
    }

    private static void Sleep(int s)
    {
        try
        {
            Thread.Sleep(s * 1000);
        }
        catch (ThreadInterruptedException)
        {
            Console.WriteLine("Sleep Interrupted");
        }
    }

    public static void Main(string[] args)
    {
        new Assignment1().StartSimulation();
    }
}
