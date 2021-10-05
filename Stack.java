package stacksqueues;
import linkedlist.Node;
import linkedlist.LinkedList;

public class Stack {
	
	private Node top;
    private LinkedList linkedList;

    public Stack() {
        this.linkedList = new LinkedList();
    }

    public void push() {
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
    }

}
