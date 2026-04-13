/**
 * An example of a Binary Search Tree (BST) that implements the required BST operations.
 * 
 * @author Zane Hamilton
 */
class Main {
  /**
   * The main method in this class performs operations using the binary search
   * tree.
   * 
   * @param args command line arguments.
   */
  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(36);
    bst.insert(24);
    bst.insert(5);
    bst.insert(67);
    bst.insert(45);
    bst.insert(98);
    bst.insert(74);
    bst.print();
    System.out.println(bst.search(5));
    /*
     * System.out.println(bst.search(8));
     * System.out.println(bst.search(100));
     * System.out.println();
     * bst.delete(10);
     * bst.print();
     * bst.traverseInOrder(bst.root);
     * System.out.println();
     * System.out.println("Height: " + bst.height());
     */
  }
}