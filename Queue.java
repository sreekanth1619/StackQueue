package stacksqueues;
import linkedlist.Node;
import linkedlist.LinkedList;

public class Queue {
	 private Node top;
	    Node head;
	    Node tail;
	    private linkedlist.LinkedList linkedList;

	    public Queue() {
	        this.linkedList = new LinkedList();
	    }

	    public void enqueue() {
	        linkedList.append(56);
	        linkedList.append(30);
	        linkedList.append(70);
	        linkedList.print();
	    }

	    public void dequeue() {
	        enqueue();
	        top = head;
	        Node temp = top;
	        while (temp != null) {
	            linkedList.pop();
	            temp = temp.next;
	        }
	        System.out.println("After");
	        linkedList.print();
	    }
	}
		

