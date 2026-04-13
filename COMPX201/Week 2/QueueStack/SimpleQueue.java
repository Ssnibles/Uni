/**
 * A linked list class which stores a head and standard operations, following a Queue structure.
 * 
 * @author Zane Hamilton
 */
public class SimpleQueue {

  private Node head;

  /**
   * Add a new Node to the list.
   * 
   * @param x the value to be added.
   */
  public void enqueue(String x) {
    Node newNode = new Node(x);
    if (isEmpty()) { head = newNode; }
    else{
      Node current = head;
      while (current.next != null){
        current = current.next;
      }
      current.next = newNode;
    }
  }

  /**
   * Removes an item from the list.
   * 
   * @param x the value to be removed.
   */
  public Node dequeue(){
    if (isEmpty()) { return null; }
    Node temp = head;
    head = head.next;
    return temp;
  }

  /**
   * Check if the list has a specified item.
   * 
   * @param x the value to be checked.
   * @return true if the list has the item, false otherwise.
   */
  public boolean hasItem(String x) {
    Node current = head;
    while (current != null){
      if (current.value == x){
        return true;
      }
      current = current.next;
    }
    return false;
  }

  /**
   * Prints the contents of the list to the console window.
   */
  public void print() {
    Node current = head;
    while(current != null){
      System.out.print(current.value + "<-");
      current = current.next;
    }
    System.out.println("");
  }

  /**
   * Determines if the list is empty or not
   * 
   * @return true if the list is empty, false otherwise.
   */
  public boolean isEmpty() {
    return head == null;
  }

  /**
   * Gives the number of elements in a list.
   * 
   * @return the length of the list.
   */
  public int length() {
    if (isEmpty()) return 0;
    Node current = head;
    int counter = 0;
    while (current != null){
      counter++;
      current = current.next;
    }
    return counter;
  }
}