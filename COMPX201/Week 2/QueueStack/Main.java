/**
 * An example of a Linked List that implements a stack and queue.
 * 
 * @author Zane Hamilton
 */
class Main {
  /**
   * The main method in this class performs operations using the linked list.
   * 
   * @param args command line arguments.
   */
  public static void main(String[] args) {

    // //Step 1: Queue Implementation
    // SimpleQueue queue = new SimpleQueue();
    // System.out.println(queue.isEmpty());
    // System.out.println(queue.length());
    // queue.enqueue("a");
    // queue.enqueue("b");
    // queue.enqueue("c");
    // queue.print();
    // System.out.println(queue.isEmpty());
    // System.out.println(queue.length());

    // Node last = queue.dequeue();
    // System.out.println("LAST: " + last.value);
    // queue.print();

    // queue.dequeue();
    // queue.print();
    // queue.dequeue();
    // queue.print();

    //Step 2: Stack Implementation
    SimpleStack stack = new SimpleStack();

    stack.push("a");
    stack.push("b");
    stack.push("c");
    stack.print();

    stack.pop();
    stack.print();
    System.out.println(stack.peek().value);

     Node n = stack.peek();
     System.out.println(n.value);
     stack.pop();
     stack.print();
     stack.pop();
     stack.print();
  }
}