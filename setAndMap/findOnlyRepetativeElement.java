package setAndMap;
import java.util.*;
public class findOnlyRepetativeElement {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
		int n=sc.nextInt();
		int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			 HashSet<Integer> s = new HashSet<Integer>();
			
			    for (int i = 0; i < n; i++)  
			    {  
			    	
			        if (s.contains(arr[i]))  
			          System.out.println(arr[i]);
			       
			        	
			        s.add(arr[i]);  
			    }
			    System.out.println(-1);
			
		}

	}

}
