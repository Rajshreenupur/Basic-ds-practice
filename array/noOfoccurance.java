package array;

import java.util.Scanner;

public class noOfoccurance {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			
			int k=scan.nextInt();
			int n=scan.nextInt();//get input from user for array length
			int arr[]=new int[n]; //declaring an array of n elements
			//for loop takes input from user
			for(int i=0; i<n; i++){
			   
			   arr[i]=scan.nextInt();//takes input from user for array
			   }
			int count=0;
			for(int i=0; i<n; i++){
				if(k==arr[i]) {
					count++;
				}
			}
			System.out.print(count);
}
	}
}
