package array;

import java.util.Scanner;

public class negativeArrayONeSide {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
			
			int n=scan.nextInt();//get input from user for array length
			int arr[]=new int[n]; //declaring an array of n elements
			//for loop takes input from user
			for(int i=0; i<n; i++){
			   
			   arr[i]=scan.nextInt();//takes input from user for array
			   
			   }
			 
				 int j = 0, temp;
		        for (int i = 0; i < n; i++) {
		            if (arr[i] < 0) {
		                if (i != j) {
		                    temp = arr[i];
		                    arr[i] = arr[j];
		                    arr[j] = temp;
		                }
		                j++;
		            }
		          
		        }
		      for(int i=0;i<n;i++) {
		    	  System.out.print(arr[i]+" ");
		      }
			 
}
	}
}

