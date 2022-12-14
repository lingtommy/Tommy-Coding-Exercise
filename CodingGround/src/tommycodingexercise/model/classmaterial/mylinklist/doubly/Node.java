package tommycodingexercise.model.classmaterial.mylinklist.doubly;

public class Node {
  private int data;
  private Node prev;
  private Node next;

  public Node(int data) {
    this.data = data;
    this.prev = null;
    this.next = null;
  }

  public int getData() {
    return data;
  }

  public Node getNext() {
    return next;
  }

  public Node getPrev() {
    return prev;
  }

  public void setData(int data) {
    this.data = data;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public void setPrev(Node prev) {
    this.prev = prev;
  }
}
