package array;

import java.util.Scanner;

public class rangeOfarray {
	public static void main(String[] args) {
	try (Scanner scan = new Scanner(System.in)) {
		
		int max,min;
		int n=scan.nextInt();//get input from user for array length
		int arr[]=new int[n]; //declaring an array of n elements
		//for loop takes input from user
		for(int i=0; i<n; i++){
		   
		   arr[i]=scan.nextInt();//takes input from user for array
		   }
		min=arr[0];//assume first element as smallest value
		   max=arr[0];//assume first element as largest value
		   for(int i=0; i<n; i++){
		     if(min>arr[i]){//loop for find minimum elements
		       min=arr[i];
		     }
		     
		     if(max<arr[i]){
		       max=arr[i];  //loop for find maximum elements
		     }
		     
		   }
		   int diff=max-min;
		System.out.print("Range:"+diff);
}
}
}

