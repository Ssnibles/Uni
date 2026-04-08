/**
 * guiAVLTree
 */
public class guiAVLTree {

  public static void main(String[] args) {
    AVLTree<Integer> avlTree = new AVLTree<>();

    // Insert some values into the AVL tree
    avlTree.insert(10);
    avlTree.insert(20);
    avlTree.insert(30);
    avlTree.insert(40);
    avlTree.insert(50);
    avlTree.insert(25);

    // Display the AVL tree
    System.out.println("AVL Tree after insertions:");
    avlTree.display();

    // Delete a value from the AVL tree
    avlTree.delete(40);

    // Display the AVL tree after deletion
    System.out.println("AVL Tree after deletion of 40:");
    avlTree.display();
  }
}
