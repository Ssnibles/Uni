public class Main {

  public static void main(String[] args) {
    AVLTree tree = new AVLTree();
    int[] toInsert = {7, 6, 3, 9, 14, 5, 4, 12, 13};
    //int[] toInsert = {7, 6, 3, 9, 14, 5, 12, 13};

    for (int i : toInsert){
      System.out.println("Inserting " + i + "...");
      tree.insert(i);
      tree.print();
      System.out.println("");
    }
  }
}