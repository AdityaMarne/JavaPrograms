package CollectionFramework;

import java.util.Iterator;
import java.util.PriorityQueue;


/*
 The priority queue class implements the Queue Interface.
 It holds the elements or objects which are to be processed by
 their priority.
 PriorityQueue doesn't allow null values to be stored in the queue.
 */

public class QueueIntPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue=new PriorityQueue<>();
		queue.add("Aditya");
		queue.add("Adnan");
		queue.add("Soham");
		queue.add("Vivek");
		
		System.out.println();
		
		System.out.println("Head :"+queue.element());
		System.out.println("Head :"+queue.peek());
		
		System.out.println();
		
		System.out.println("Iterating the queue elements :");
		Iterator itr=queue.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		queue.remove();
		queue.poll();
		
		System.out.println();
		
		System.out.println("After removing two elements :");
		Iterator itr2=queue.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}

}
