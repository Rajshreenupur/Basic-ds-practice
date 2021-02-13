package linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class findNthNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<Integer>();
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("how many elemenst do you want to add: ");
			int num=input.nextInt();
			for(int i=0;i<num;i++){
			    System.out.print("Add Element: ");
			   int a=input.nextInt();
			    list.add(a);
			}
		
        System.out.println();
        int  element = input.nextInt(); 
        
        // Initializing the answer to the index -1 
        int ans = -1; 
  
        // Traversing through the Linked List 
        for (int i = 0; i < list.size(); i++) { 
  
            // Extracting each element in 
            // the Linked List 
            int llElement = list.get(i); 
  
            // Checking if the extracted element is equal to 
            // the element to be searched 
            if (llElement == element) { 
  
                // Assigning the index of the 
               
                ans = list.indexOf(element); 
                break; 
            } 
        } 
        // Checking if the element is present in the Linked 
        // List 
        if (ans == -1) { 
            System.out.println("Element not found"); 
        } 
        else { 
            System.out.println( 
                "Element found in Linked List at " + ans); 
        } 
    } 
}
}
