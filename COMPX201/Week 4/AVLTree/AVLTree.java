/**
 * A class that implements a binary search tree of integers.
 * 
 * @author Zane Hamilton
 */
public class AVLTree {

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

  private int getHeight(Node current) {
    //Different from the lecture (returning 0 assumes height starts at 1, changed to -1)
    if (current == null) return -1;
    else return current.height;
  }

  private void updateNode(Node current) {
    if (current != null) {
      int leftHeight = getHeight(current.left);
      int rightHeight = getHeight(current.right);
      current.height = Math.max(leftHeight, rightHeight) + 1;
      current.balanceFactor = leftHeight - rightHeight;
      //Different from the lecture (displaying values)
      System.out.println("Node " + current.value + " has height " + current.height + " and balance factor " + current.balanceFactor);
    }
  }

  private Node leftRotate(Node current) {
    Node rightNode = current.right;
    Node rightNext = rightNode.left;

    //Different from the lecture (was missing)
    rightNode.left = current;
    current.right = rightNext;
    
    updateNode(current);
    updateNode(rightNode);

    return rightNode;
  }

  private Node rightRotate(Node current) {
    Node leftNode = current.left;
    Node leftNext = leftNode.right;

    leftNode.right = current;
    current.left = leftNext;

    updateNode(current);
    updateNode(leftNode);

    return leftNode;
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

    //Balancing
    updateNode(current);

    if(current.balanceFactor > 1 && value < current.left.value){
      System.out.println("Condition 1: Zig-Zig Left");
      return rightRotate(current);
    }
    if(current.balanceFactor < -1 && value > current.right.value) {
      System.out.println("Condition 2: Zig-Zig Right");
      return leftRotate(current);
    }
    if(current.balanceFactor > 1 && value > current.left.value) {
      System.out.println("Condition 3: Zig-Zag Left-Right");
      current.left = leftRotate(current.left);
      return rightRotate(current);
    }
    if(current.balanceFactor < -1 && value < current.right.value) {
      System.out.println("Condition 4: Zig-Zag Right-Left");
      current.right = rightRotate(current.right);
      return leftRotate(current);
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
      System.out.print(current.value + "->");
      printR(current.left);
      //System.out.println(current.value + "| Left: " + current.left.value + "| Right: " + current.right.value);
      printR(current.right);
      
    }
  }

  /**
   * The node class for the binary search tree.
   * 
   * @author Zane Hamilton
   */
  class Node {
    public int value;
    public int height;
    public int balanceFactor;
    public Node left;
    public Node right;

    public Node(int value) {
      this.value = value;
      height = 0;
    }
  }
}