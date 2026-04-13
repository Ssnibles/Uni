/** Main */
public class Main {
  public static void main(String[] args) {
    Record record1 = new Record("Rock", 1990, "Nirvana", "Smells Like Teen Spirit");
    Record record2 = new Record("Rock", 1991, "Pearl Jam", "Alive");
    Record record3 = new Record("Pop", 1989, "Madonna", "Like a Prayer");
    Record record4 = new Record("Rock", 1990, "Nirvana", "Smells Like Teen Spirit");

    System.out.println(record1);
    System.out.println(record2);
    System.out.println(record3);
    System.out.println(record4);

    System.out.println(record1.compareTo(record2));
    System.out.println(record1.compareTo(record3));
    System.out.println(record1.compareTo(record4));
    System.out.println(record1.compareTo(record1));

    RecordBST bst = new RecordBST();
    bst.insert(record1);
    bst.insert(record2);
    bst.insert(record3);

    System.out.println(bst.search(record1)); // true
    System.out.println(bst.search(record4)); // true
    System.out.println(
        bst.search(new Record("Rock", 1990, "Nirvana", "Smells Like Teen Spirit"))); // true
    System.out.println(
        bst.search(new Record("Rock", 1990, "Nirvana", "Smells Like Teen Spirit "))); // false
  }
}
