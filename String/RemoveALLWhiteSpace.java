package String;

import java.util.Scanner;

public class RemoveALLWhiteSpace {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			String s=sc.nextLine();
			s = s.replaceAll("\\s", ""); 
		       
	        System.out.println(s); 
			
		}
	}

}
