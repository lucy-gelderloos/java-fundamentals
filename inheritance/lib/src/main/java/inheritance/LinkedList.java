package inheritance;

public class LinkedList
{
  private Node head;

  LinkedList() {
    this.head = null;
  }

  public Node getHead() {
    return head;
  }

  public void setHead(Node head) {
    this.head = head;
  }

  public void insert(Review review) {
    Node newNode = new Node(review);
    newNode.setNext(this.head);
    this.head = newNode;
  }

  public int countNodes() {
    Node thisNode = this.head;
    int nodeCount = 0;
    while (thisNode != null) {
      nodeCount++;
      thisNode = thisNode.getNext();
    }
    return nodeCount;
  }

}
