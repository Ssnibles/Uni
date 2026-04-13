/**
 * An example of Linked List operations that have a recursive implementation.
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
    RecursiveLinkedList list = new RecursiveLinkedList();
    // System.out.println(list.hasItem(1));
    list.add(1);
    // System.out.println(list.hasItem(5));
    list.add(5);
    // System.out.println(list.hasItem(5));
    list.add(8);
    // System.out.println(list.hasItem(8));
    list.print();
    System.out.println(list.length());
    list.remove(1);
    list.print();
  }
}