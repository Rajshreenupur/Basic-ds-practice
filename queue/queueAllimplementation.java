package queue;

import java.util.*;


public class queueAllimplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			int t=sc.nextInt();
			Queue<Integer>q=new LinkedList<>();
			while(t-->0) {
				System.out.print("Enter numbers: ");
				int number = sc.nextInt();

				
				q.add(number);
		    }
			System.out.println("First Element:"+q.peek());
			System.out.println("Remove First Element:"+q.remove());
			System.out.println("Element are:"+q);
			System.out.println("Element are:"+q.size());

	}

}
}
