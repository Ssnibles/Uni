public class customDataTypeLinkedList {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add(new Person("Alice", 30));
    list.add(new Person("Bob", 25));
    list.add(new Person("Charlie", 35));

    System.out.println("Linked List of People:");
    list.printList();
  }

  static class Person {
    String name;
    int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    @Override
    public String toString() {
      return name + " (" + age + " years old)";
    }
  }

  static class Node {
    Person data;
    Node next;

    public Node(Person data) {
      this.data = data;
      this.next = null;
    }
  }

  static class LinkedList {
    Node head;

    public void add(Person data) {
      Node newNode = new Node(data);
      if (head == null) {
        head = newNode;
        return;
      }
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }

    public void printList() {
      Node current = head;
      while (current != null) {
        System.out.println(current.data);
        current = current.next;
      }
    }
  }
}
