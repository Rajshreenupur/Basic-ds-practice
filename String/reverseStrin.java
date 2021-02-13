package String;

import java.util.Scanner;

public class reverseStrin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			String s=sc.nextLine();
			char[] str=new char[s.length()];
			char[] rev=new char[s.length()];
			for(int i=0;i<s.length();i++)
				str[i] = s.charAt(i);
    
			int j=0;
    for(int i=s.length()-1;i>=0;i--)
    {
			    rev[j]=str[i];
			    j++;
    }
 System.out.println("the reverse string is:");
  //print reverse array
  for(int i=0;i<s.length();i++)
  System.out.print(rev[i]);
		}
	}

}
