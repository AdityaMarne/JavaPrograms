package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/*
 ArrayDeque class implements the Deque interface.
 Unlike queue, we can add or delete the elements from both
 the ends.
 
 ArrayDeque is faster than ArrayList and Stack and as no capacity
 restrictions.
 */

public class DequeArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque=new ArrayDeque<String>();
		
		deque.add("Aditya");
		deque.add("Adnan");
		deque.add("Soham");
		deque.add("Vivek");
		
		System.out.println();
		
		//Traversing elements
		Iterator itr=deque.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
