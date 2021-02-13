package setAndMap;

import java.util.*;
import java.util.Scanner;

public class removeDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			String s=sc.nextLine();
			String[]inputarr=s.split(" ");
			Set<String>sentence=new LinkedHashSet<>();
			for(String x:inputarr) {
				sentence.add(x);
			}
			Iterator<String> itr=sentence.iterator();
			while(itr.hasNext())
			System.out.print(itr.next()+" ");
		}
	}

}
