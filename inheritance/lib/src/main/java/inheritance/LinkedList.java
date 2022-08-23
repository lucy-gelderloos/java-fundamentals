package inheritance;

public class LinkedList
{
  public Node head;

  public LinkedList() {
    this.head = null;
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

  @Override
  public String toString() {
    String contents = "Reviews/n";
    // same loop as above, except add the value to the string instead of checking against an argument
    Node thisNode = this.head;
    while (thisNode != null) {
      contents += thisNode.getValue() + "/n";
      thisNode = thisNode.getNext();
    }
      return contents + "***";
    }
}
