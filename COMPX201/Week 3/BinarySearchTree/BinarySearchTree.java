/**
 * A class that implements a binary search tree of integers.
 * 
 * @author Zane Hamilton
 */
public class BinarySearchTree {

  private Node root;

  /**
   * A function that searches for a value in the binary search tree.
   * 
   * @param value the value to search for.
   * @return true if the value is in the tree, false otherwise.
   */
  public boolean search(int value) {
    return searchR(value, root);
  }

  private boolean searchR(int value, Node current) {
    if (current == null) {
      return false;
    }

    if (current.value == value){
      return true;
    }

    if (value < current.value) {
      return searchR(value, current.left);
    }

    return searchR(value, current.right);
  }

  /**
   * A function that inserts a value into the binary search tree.
   * 
   * @param value the value to insert.
   */
  public void insert(int value) {
    root = insertR(value, root);
  }

  public Node insertR(int value, Node current) {
    if (current == null) {
      return new Node(value);
    }
    if (value < current.value) {
      current.left = insertR(value, current.left);
    }
    else {
      current.right = insertR(value, current.right);
    }
    return current;
    
  }

  /**
   * A function that uses one of our traversals to print the contents of the tree.
   */
  public void print() {
    printR(root);
    System.out.println();
  }

  private void printR(Node current) {
    if (current != null) {
      printR(current.left);
      //System.out.println(current.value + "| Left: " + current.left.value + "| Right: " + current.right.value);
      printR(current.right);
      System.out.print(current.value + "->");
    }
  }

  /**
   * The node class for the binary search tree.
   * 
   * @author Zane Hamilton
   */
  class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
      this.value = value;
    }
  }
}