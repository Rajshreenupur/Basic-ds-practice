package linkedList;
import java.util.*;

class deleteAndElement
{
    public static void main(String[] args) 
    {

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
  
        
        System.out.println("LinkedList elements after deletions are: ");
        LinkedList<Integer> toRemove=new LinkedList<Integer>();
        toRemove.add(element);
        list.removeAll(toRemove);
         System.out.println(list);
        }
    
    } 
}

