/*
*  The class that denotes each self-referential node in a LinkedList structure.
*
*  @author Zane Hamilton
*/

public class Node {
  public String value;
  public Node next;

  /*
  *  The constructor that creates a new node with a given value.
  *
  *  @param value   The value to be stored in the node.
  */
  public Node(String value) {
    this.value = value;
    next = null;
  }
}