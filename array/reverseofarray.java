package array;

import java.util.*;

public class reverseofarray {
	public static void main(String[] args) {
		 int j=0;
        //initialise first array
        int[] arr=new int[40];
        //initialise second array for store reverse array
        int[] rev=new int[40];
        try (//declare scanner class
		Scanner sc = new Scanner(System.in)) {
			//take input of size from the user
			System.out.println("enter size");
			int size=sc.nextInt();
			//take element of array1 from user
			System.out.println("enter element");
			for(int i=0;i<size;i++)
			      arr[i]=sc.nextInt();
      //here we are stroring last element of array in the reverse array
      for(int i=size-1;i>=0;i--)
      {
			    rev[j]=arr[i];
			    j++;
      }
   System.out.println("the reverse array");
    //print reverse array
    for(int i=0;i<size;i++)
    System.out.print(rev[i]+" ");
		}
   }
} 

