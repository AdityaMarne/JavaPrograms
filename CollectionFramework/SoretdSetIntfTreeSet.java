package CollectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

/*
 Java TreeSet class implements the Set interface that uses a 
 tree for storage
 
 TreeSet also contains unique elements.
 
 However, the access and retrieval time of TreeSet is quite fast.
 
 The elements in TreeSet stored in ascending order.
 */

public class SoretdSetIntfTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set=new TreeSet<String>();
		
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
