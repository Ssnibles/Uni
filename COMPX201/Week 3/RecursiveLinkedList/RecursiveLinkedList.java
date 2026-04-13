/**
 * A linked list class which stores a head and standard operations.
 * 
 * @author Zane Hamilton
 */
public class RecursiveLinkedList {

  class Node {
    int value;
    Node next;

    public Node(int value){
      this.value = value;
      next = null;
    }

  }

  private Node head;

  /**
   * Add a new Node to the list.
   * 
   * @param x the value to be added.
   */
  public void add(int x) {
    Node newNode = new Node(x);
    newNode.next = head;
    head = newNode;
  }

  /**
   * Check if the list has a specified item.
   * 
   * @param x the value to be checked.
   * @return true if the list has the item, false otherwise.
   */
  public boolean hasItem(int x) {
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
    printR(head);
    System.out.println();
  }

  private void printR(Node current) {
    if (current != null) {
      System.out.print(current.value + "->");
      printR(current.next);
    }
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
    return lengthR(head);
  }

  private int lengthR(Node current) {
     if (current == null) {
       return 0;
     }
    return 1 + lengthR(current.next);
  }

  /**
   * Removes an item from the list.
   * 
   * @param x the value to be removed.
   */
  public void remove(int x) {
    if (isEmpty() && !hasItem(x)) { return; }
    head = removeR(x, head);
  }

  private Node removeR(int x, Node current) {
    if (current.value == x) {
      return current.next;
    }
    current.next = removeR(x, current.next);
    return current;
  }
}