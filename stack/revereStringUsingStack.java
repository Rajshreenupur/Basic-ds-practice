package stack;
import java.util.Scanner;
import java.util.Stack;

public class revereStringUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try (Scanner sc = new Scanner(System.in)) {
		    	String str =sc.nextLine();
		    	Stack<String> stack = new Stack<String>();
		    	
		            stack.push(str); 
		            //this stack is used to store reverse string
		            Stack<Character> stack1 = new Stack<Character>();
		         // push every character of the given string into the stack
		            char[] ch = str.toCharArray();
		            for (int i = 0; i < str.length(); i++)
		                stack1.push(ch[i]);
		     
		            // start from index 0
		            int k = 0;
		     
		            // pop characters from the stack until it is empty
		            while (!stack1.isEmpty())
		            {
		                // assign each popped character back to the character array
		                ch[k++] = stack1.pop();
		            }
		     
		            // convert the character array into string and return it
		           System.out.println( String.copyValueOf(ch));
		        }
		     
		            	
				          
		            
		        }  
	}


