public class Main {

  public static void main(String[] args){
    NumberSet set = new NumberSet();
    System.out.println(set.isEmpty());
    set.add(1);
    System.out.println(set.isEmpty());
    set.add(2);
    set.add(3);
    set.add(3);
    set.add(4);
    set.add(5);
    set.print();
    NumberSet set1 = new NumberSet();
    set1.add(2);
    set1.add(3);
    set1.add(5);
    set1.print();
    //System.out.println(set.isSubset(set1));
  }
}