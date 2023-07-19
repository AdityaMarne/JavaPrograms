package AccessModifierParent;

import java.util.*;

/*
 In this example, we have created two classes A and Simple.
  A class contains private data member and private method. 
  We are accessing these private members from outside the class,
  so there is a compile-time error.
 */

class A{
	private int data=40;
	private void msd()
	{
		System.out.println("Hello java");
	}
}

public class SimplePrivate {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		System.out.pritln(obj.data);
		obj.msg();
	}

}
