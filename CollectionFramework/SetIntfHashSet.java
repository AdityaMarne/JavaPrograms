package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 HashSet class implements Set Interface.
 
 It represent te collection that uses a hash table for storage.
 
 Hashing is used to store the elements in the HashSet.
 It contains unique items.
 */

public class SetIntfHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hash=new HashSet<String>();
		
		hash.add("Ravi");
		hash.add("Vijay");
		hash.add("Ravi");
		hash.add("Vivek");
		
		//Traversing elements
		Iterator itr=hash.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
