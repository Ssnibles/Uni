/**
* This class is the main class that showcases the key operations of the SimpleLinkedList implementation.
*
* @author Zane Hamilton
*/
public class Main {

  /**
   * The main method in this class performs operations using the linked list.
   * 
   * @param args command line arguments.
   */
  public static void main(String[] args) {
    // create and new list for implemented operations
    SimpleLinkedList list = new SimpleLinkedList();
    System.out.println(list.isEmpty());
    System.out.println(list.length());
    list.add(10);
    list.add(20);
    list.add(30);
    list.print();
    //System.out.println(list.isEmpty());
    System.out.println(list.hasItem(10));
    System.out.println(list.hasItem(40));
    System.out.println(list.isEmpty());
    System.out.println(list.length());

    //list.remove(10);
    //System.out.println(list.length());
    list.print();
  }
}