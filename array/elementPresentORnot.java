package array;

import java.util.Scanner;

public class elementPresentORnot {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			int a=sc.nextInt();
			int arr[]=new int[5];
			 
				for(int i=0;i<=a;i++) {
					arr[i]=sc.nextInt();
				}
				boolean result = false; 
		        for (int element : arr) { 
		            if (element == n) { 
		               result = true; 
		                break; 
		            }
		        } 
					System.out.print(result);	
					}
				
				}
			
		}
	


