package CollectionFramework;

import java.util.LinkedList;
import java.util.Iterator;

/*
 LinkedList implements the collection interface.
 It uses a doubly linked list internally to store the elements.
 It can store the duplicate elements.
 */

public class ListIntLinkedList
{
	public static void main(String args[])
	{
		LinkedList<String> al=new LinkedList<>();
		
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}