import java.util.Random;

/**
 * An example of a hash table implementation.
 * 
 * @author Zane Hamilton
 */
class Main {
  /**
   * The main method in this class performs operations using a hash table.
   * 
   * @param args command line arguments.
   */
  public static void main(String[] args) {
    HashTable hashtable = new HashTable(10);
    Random rand = new Random(1);
    for (int i = 0; i < 10; i++) {
      hashtable.put(rand.nextInt(100000));
    }
    hashtable.dump();
    System.out.println(hashtable.contains(6606));
    System.out.println(hashtable.get(6606));
    hashtable.remove(6606);
    System.out.println(hashtable.get(6606));
    System.out.println(hashtable.contains(6606));
    hashtable.dump();
  }
}