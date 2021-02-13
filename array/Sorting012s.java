package array;

import java.util.Scanner;

public class Sorting012s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try (Scanner scan = new Scanner(System.in)) {
			
			int i;
			int n=scan.nextInt();//get input from user for array length
			int arr[]=new int[n]; //declaring an array of n elements
			//for loop takes input from user
			for( i=0; i<n; i++){
			   
			   arr[i]=scan.nextInt();//takes input from user for array
			   }
			for( i=0; i<arr.length; i++){
				int minInd=i;
				for(int j=1; j<arr.length-1; j++){
				if(arr[j]<arr[minInd]) {
					minInd=j;
				}
			}
			
				int temp=arr[i];
				arr[i]=arr[minInd];
				arr[minInd]=temp;
			}
			
			System.out.print(arr[i]+" ");
}
	}
}



			
			 