package inheritance;

public class Node {
  Review value;
  Node next;
  public Node(Review value){
    this.value = value;
  }

  public Node() {
    this.value = null;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node getNext() {
    return next;
  }

  public void setValue(Review value) {
    this.value = value;
  }

  public Review getValue() {
    return value;
  }

}
