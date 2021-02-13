package String;

import java.util.Scanner;

public class StringsAREanagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			String s=sc.nextLine();
			String a=sc.nextLine();
			boolean isAnagram=false;
			boolean visited[]=new boolean[a.length()];
			
			if(s.length()==a.length()) {
				for(int i=0;i<s.length();i++) {
					char c=s.charAt(i);
					isAnagram=false;
				
				for(int j=0;j<s.length();j++) {
					if(a.charAt(j)==c && !visited[j]) {
						visited[j]=true;
						isAnagram=true;
						break;
					}
				}
				
			if(!isAnagram) {
				break;
			}
				}
			}
				if(isAnagram) {
						System.out.println("true");
					}else {
						System.out.println("false");
					}
				}
			}
				
    
	

}



