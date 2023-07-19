package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
LinkedHashSet class represents the LinkedList implementation
of Set Interface.

It extends the HashSet class and implements Set interface.

Like HashSet, it also contains unique elements.

It maintains the insertion order and permits null elements.
 */

public class SetIntfLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> linkedlisthashset=new LinkedHashSet<String>();
		
		linkedlisthashset.add("Ravi");
		linkedlisthashset.add("Vijay");
		linkedlisthashset.add("Ravi");
		linkedlisthashset.add("Ajay");
		
		Iterator itr=linkedlisthashset.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
