package String;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s=sc.nextLine();
			System.out.print(s);
		}
	}
}