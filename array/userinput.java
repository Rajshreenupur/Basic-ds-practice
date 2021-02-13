package array;

import java.util.Scanner;

public class userinput{
	public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<=arr.length;i++) {
			arr[i]=sc.nextInt();
			System.out.print(arr[i]+" ");
		}
		
	
}
}
}