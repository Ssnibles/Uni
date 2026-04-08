// Import the linked list class
import java.util.LinkedList;

public class SimpleList {
  public static void main(String[] args) {
    // Create the new list
    LinkedList<String> cars = new LinkedList<String>();
    // Add strings to the list
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    // Print out the list
    System.out.println(cars);
    // Print the first and last value in the list
    System.out.println("First: " + cars.getFirst() + " Last: " + cars.getLast());
  }
}
