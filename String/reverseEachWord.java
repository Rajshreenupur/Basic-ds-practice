package String;

import java.util.Scanner;

public class reverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Original string : ");
 
        String originalStr = scanner.nextLine();
        scanner.close();
 
        String words[] = originalStr.split("\\s");
        String reversedString = "";
 
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
 
        // Displaying the string after reverse
        System.out.print("Reversed string : " + reversedString);
    }
}
	
