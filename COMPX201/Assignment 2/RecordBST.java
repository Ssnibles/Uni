/** RecordBST */
public class RecordBST {

  // Class for the nodes of the BST
  public class Node {
    Record record;
    Node left;
    Node right;

    public Node(Record record) {
      this.record = record;
      this.left = null;
      this.right = null;
    }
  }

  private Node record;

  public RecordBST() {
    this.record = null;
  }

  public void insert(Record record) {
    this.record = insertR(this.record, record);
  }

  private Node insertR(Node node, Record record) {
    if (node == null) {
      return new Node(record);
    }
    int cmp = record.compareTo(node.record);
    if (cmp < 0) {
      node.left = insertR(node.left, record);
    } else if (cmp > 0) {
      node.right = insertR(node.right, record);
    }
    return node;
  }

  public void remove(Record record) {
    this.record = removeR(this.record, record);
  }

  private Node removeR(Node node, Record record) {
    if (node == null) {
      return null;
    }
    int cmp = record.compareTo(node.record);
    if (cmp < 0) {
      node.left = removeR(node.left, record);
    } else if (cmp > 0) {
      node.right = removeR(node.right, record);
    } else {
      if (node.left == null) {
        return node.right;
      } else if (node.right == null) {
        return node.left;
      }
      Node temp = findMin(node.right);
      node.record = temp.record;
      node.right = removeR(node.right, temp.record);
    }
    return node;
  }

  private Node findMin(Node node) {
    while (node.left != null) {
      node = node.left;
    }
    return node;
  }

  public boolean search(Record record) {
    return searchR(this.record, record);
  }

  private boolean searchR(Node node, Record record) {
    if (node == null) {
      return false;
    }
    int cmp = record.compareTo(node.record);
    if (cmp < 0) {
      return searchR(node.left, record);
    } else if (cmp > 0) {
      return searchR(node.right, record);
    } else {
      return true;
    }
  }

  public void getHeight() {
    System.out.println(getHeightR(this.record));
  }

  private int getHeightR(Node node) {
    if (node == null) {
      return -1;
    }
    int leftHeight = getHeightR(node.left);
    int rightHeight = getHeightR(node.right);
    return Math.max(leftHeight, rightHeight) + 1;
  }

  public void getMinimum() {
    if (this.record == null) {
      System.out.println("The BST is empty.");
    } else {
      Node minNode = findMin(this.record);
      System.out.println(minNode.record);
    }
  }

  public void getMaximum() {
    if (this.record == null) {
      System.out.println("The BST is empty.");
    } else {
      Node maxNode = findMax(this.record);
      System.out.println(maxNode.record);
    }
  }

  private Node findMax(Node node) {
    while (node.right != null) {
      node = node.right;
    }
    return node;
  }

  public void print() {
    printR(this.record);
  }

  private void printR(Node node) {
    if (node != null) {
      printR(node.left);
      System.out.println(node.record);
      printR(node.right);
    }
  }
}
