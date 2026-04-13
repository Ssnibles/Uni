/** RecordBST */
public class RecordBST {

  private Node record;

  public RecordBST() {
    this.record = null;
  }

  public void insert(Record record) {
    this.record = insertHelper(this.record, record);
  }

  private Node insertHelper(Node node, Record record) {
    if (node == null) {
      return new Node(record);
    }
    int cmp = record.compareTo(node.record);
    if (cmp < 0) {
      node.left = insertHelper(node.left, record);
    } else if (cmp > 0) {
      node.right = insertHelper(node.right, record);
    }
    return node;
  }

  public void remove(Record record) {
    this.record = removeHelper(this.record, record);
  }

  private Node removeHelper(Node node, Record record) {
    if (node == null) {
      return null;
    }
    int cmp = record.compareTo(node.record);
    if (cmp < 0) {
      node.left = removeHelper(node.left, record);
    } else if (cmp > 0) {
      node.right = removeHelper(node.right, record);
    } else {
      if (node.left == null) {
        return node.right;
      } else if (node.right == null) {
        return node.left;
      }
      Node temp = findMin(node.right);
      node.record = temp.record;
      node.right = removeHelper(node.right, temp.record);
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
    return searchHelper(this.record, record);
  }

  private boolean searchHelper(Node node, Record record) {
    if (node == null) {
      return false;
    }
    int cmp = record.compareTo(node.record);
    if (cmp < 0) {
      return searchHelper(node.left, record);
    } else if (cmp > 0) {
      return searchHelper(node.right, record);
    } else {
      return true;
    }
  }

  public void getHeight() {
    System.out.println(getHeightHelper(this.record));
  }

  private int getHeightHelper(Node node) {
    if (node == null) {
      return -1;
    }
    int leftHeight = getHeightHelper(node.left);
    int rightHeight = getHeightHelper(node.right);
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
    printHelper(this.record);
  }

  private void printHelper(Node node) {
    if (node != null) {
      printHelper(node.left);
      System.out.println(node.record);
      printHelper(node.right);
    }
  }
}
