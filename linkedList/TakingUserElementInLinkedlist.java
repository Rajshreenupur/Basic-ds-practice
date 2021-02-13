package linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class TakingUserElementInLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        LinkedList<String> list=new LinkedList<String>();
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("how many elemenst do you want to add: ");
			int num=input.nextInt();
			for(int i=0;i<num;i++){
			    System.out.print("Add Element: ");
			    String element=input.next();
			    list.add(element);
			}
		}
        System.out.println();
        System.out.println("LinkedList elements are: ");
        for(int i=0;i<list.size();i++){

         System.out.println(list.get(i));
        }
    
	}

}
