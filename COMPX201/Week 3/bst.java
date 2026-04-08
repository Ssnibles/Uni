// A simple implementation of a Binary Search Tree (BST) in Java
public class bst {
  public static void main(String[] args) {
    Node root = new Node(10);
    insert(root, 5);
    insert(root, 15);
    insert(root, 3);
    insert(root, 7);
    insert(root, 12);
    insert(root, 18);

    // Display the traversals
    System.out.println("Inorder Traversal:");
    inorder(root);

    System.out.println("\n\nPreorder Traversal:");
    preorder(root);

    System.out.println("\n\nPostorder Traversal:");
    postorder(root);
  }

  static class Node {
    int data;
    Node left, right;

    public Node(int item) {
      data = item;
      left = right = null;
    }
  }

  // Insert a new key into the BST
  static void insert(Node root, int key) {
    if (key < root.data) {
      if (root.left == null) {
        root.left = new Node(key);
      } else {
        insert(root.left, key);
      }
    } else if (key > root.data) {
      if (root.right == null) {
        root.right = new Node(key);
      } else {
        insert(root.right, key);
      }
    }
  }

  // Inorder traversal: left, root, right
  static void inorder(Node root) {
    if (root != null) {
      inorder(root.left);
      System.out.print(root.data + "->");
      inorder(root.right);
    }
  }

  // Preorder traversal: root, left, right
  static void preorder(Node root) {
    if (root != null) {
      System.out.print(root.data + "->");
      preorder(root.left);
      preorder(root.right);
    }
  }

  // Postorder traversal: left, right, root
  static void postorder(Node root) {
    if (root != null) {
      postorder(root.left);
      postorder(root.right);
      System.out.print(root.data + "->");
    }
  }
}
