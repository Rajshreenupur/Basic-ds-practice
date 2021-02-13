package linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class countTheElements {

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
        int count=0;
        for (int i = 0; i < list.size(); i++) {
                 if(list.get(i)==element) {
                	 count++;
                 }
	}
        System.out.print(count);

}
	}
}
