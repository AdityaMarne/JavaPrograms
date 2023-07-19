package	CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

/*
 The ArrayList class implements the List interface.
 It uses a dynamic array to store the duplicate element of different
 data types.
*/

class ListIntArrayList
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>(); //Creating arraylist
		
		list.add("Ravi"); //Adding object in arraylist.
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
		//Traversing list through Iterator
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}