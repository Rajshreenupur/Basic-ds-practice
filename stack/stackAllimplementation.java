package stack;

import java.util.Scanner;
import java.util.Stack;


public class stackAllimplementation {

	public static void main(String[] args) {
	    try (Scanner sc = new Scanner(System.in)) {
	    	int t=sc.nextInt();
	    	Stack<Integer> stack = new Stack<Integer>();
	    while(t-->0) {
			System.out.print("Enter numbers: ");
			int number = sc.nextInt();

			
			stack.push(number);
	    }

	     System.out.println(stack.peek());
			    System.out.println(stack.pop());
			    System.out.println(stack.peek());
			    System.out.println(stack.empty());
			    System.out.println(stack.search(1));
			}
		}
	
	}