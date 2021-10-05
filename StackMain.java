package stacksqueues;

import java.util.Scanner;

public class StackMain {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter 1 to add element in the Stack");
	        System.out.println("Enter 2 to Peek and Pop elements from stack");

	        Stack stack = new Stack();

	        switch (sc.nextInt()) {
	            case 1:
	                stack.push();
	                break;
	            case 2:
	                stack.peek();
	                stack.pop();
	                break;
	            default:
	                System.out.println("Enter correct choice");
	        }
	    }
}
