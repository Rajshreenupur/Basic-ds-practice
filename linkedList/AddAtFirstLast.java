package linkedList;
import java.util.*;
public class AddAtFirstLast {

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
	     //Adding an element to the first position
        int g=input.nextInt();
        int f=input.nextInt();
        int h=input.nextInt();
	     list.addFirst(g);

	     //Adding an element to the last position
	     list.addLast(f);

	     //Adding an element to the 3rd position
	     list.add(2, h);

	     //Iterating LinkedList
	     Iterator<Integer> iterator=list.iterator();
	     while(iterator.hasNext()){
	    	 
	       System.out.println("After element added:"+iterator.next());
	     }
	   
	}

	}
}
