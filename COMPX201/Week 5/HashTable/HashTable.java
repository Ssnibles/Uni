import java.util.*;

/**
 * A class that implements a hash table using an array.
 * 
 * @author Zane Hamilton
 */
public class HashTable {
  private int[] table;
  private int size;

  private int fullRows;
  private int numOfRehashes;
  private int numOfCollisions;


  /**
   * Initialises the hash table ensuring all variables are set up.
   */
  public HashTable(int size) {
    this.size = size;
    this.table = new int[size];
  }

  /**
   * The method that computes the hash function for each item.
   * 
   * @param k the value that needs a hash value
   * @return the key into the hash table where we can store the value
   */
  private int hash(int k) {
    return k % size;
  }

  /**
   * Adds a new integer value to the hash table.
   * 
   * @param x the value to insert into the table
   */
  public void put(int x) {
    int key = hash(x);
    if (table[key] == 0) {
      table[key] = x;
      fullRows++;
    }
    else {
      numOfCollisions++;
      rehash(key, x);
    }
  }

  /**
   * Checks to see if the hash table is full (i.e. how many spaces are left?).
   */
  private float checkFull() {
    return (float) (fullRows / size)
  }

  /**
   * Removes the specified value from the hash table.
   * 
   * @param x the value to be removed
   */
  public void remove(int x) {
    int key = hash(x);
    if (table[key] == x) {
      table[key] = 0;
      fullRows--;
    }
  }

  /**
   * Checks to see if the specified value is in the hash table.
   * 
   * @param x the value to find
   * @return whether or not the value is in the table
   */
  public boolean contains(int x) {
     int key = hash(x);
     return table[key] == x;
  }

  /**
   * Get an item from the hash table based on its key.
   * 
   * @param k the key to the value
   * @return the value to be returned
   */
  public int get(int k) {
    if (k < 0 || k >= size) { return -1;}
    return table[k];
  }

  /**
   * Determines if the hash table is empty.
   * 
   * @return whether or not the table is empty
   */
  public boolean isEmpty() {
    return false;
  }

  /**
   * Returns the current size of the hash table.
   * 
   * @return the size of the table
   */
  public int getSize() {
    return this.size;
  }

  /**
   * A function which handles a hash collision.
   * 
   * @param key the key to be rehashed.
   * @param x   the value to be inserted.
   */
  public void rehash(int key, int x) {
    System.out.println("Rehash function called.");
    float full = checkFull();
    System.out.println("Full: " + full);
    if (full >= 0.75) {
      System.out.println("Resizing");
      int[] copy = table;
      size = size * 2;
      table = new int[size];
      fullRows = 0;
      for (int i = 0; i < copy.length; i++) {
        if (copy[i] != 0) {
          put(copy[i]);
        }
      }
      put(x);
    }
    else {
      System.out.println("Rehashing");
      int i = key;
      int j = 1;
      while (table[i] != 0 && i < size) {
        i = (i + j ** j);
      }
      if (i < size) {
        table[i] == x;
        fullRows++;
        numOfRehashes++;
      }
    }
  }

  /**
   * Print the contents of the hash table to standard out.
   */
  public void dump() {
    for (int i = 0; i < table.length; i++) {
      System.out.println("[" + i + "] " + table[i]);
    }
    System.out.println("Number of collisions: " + numOfCollisions);
    System.out.println("Number of rehashes: " + numOfRehashes);
    System.out.println("Number of full rows: " + fullRows);
  }
}