/** Node */
public class Node {
  public Record record;
  public Node left;
  public Node right;

  public Node(Record record) {
    this.record = record;
    this.left = null;
    this.right = null;
  }
}
