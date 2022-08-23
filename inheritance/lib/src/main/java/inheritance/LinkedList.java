package inheritance;

public class LinkedList
{
  public Node head;

  public LinkedList() {
    // creates new list with head null
    this.head = null;
  }

  //https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/
  public void insert(Review value) {
    // creates new node using Node class
    Node newNode = new Node(value);
    // sets pointer of new node to point at current head
    newNode.setNext(this.head);
    // makes new node new head
    this.head = newNode;
  }

  public int countNodes() {
    Node thisNode = this.head;
    int nodeCount = 0;
    while (thisNode != null) {
      nodeCount++;
      // move to the next node
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
