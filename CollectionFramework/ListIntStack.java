package CollectionFramework;

import java.util.Iterator;
import java.util.Stack;

/*
 The stack is the subclass of Vector.It implements the last-in-first-out
 data structure.The stack contains all of the methods of vector class 
 and also provides its methods like boolean push(),boolean peek(),
 boolean push(object o) properties.
 */


public class ListIntStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String > stack=new Stack<String>();
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Garima");
		
		stack.pop();
		
		Iterator<String> itr=stack.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}

}
