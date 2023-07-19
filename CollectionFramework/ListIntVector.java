package CollectionFramework;

import java.util.Iterator;
import java.util.Vector;

/*
 Vector uses a dynamic array to store the data elements.It is similar
 to ArrayList.
 */

public class ListIntVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<String>();
		v.add("Ayush");
		v.add("Amit");
		v.add("Ashish");
		v.add("Garima");
		
		Iterator<String> itr=v.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
