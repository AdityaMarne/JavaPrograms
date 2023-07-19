package ThisKeyword;

import java.util.*;

/*
3.this() can be used to invoke current class constructor.
-The this() constructor call can be used to invoke the 
current class constructor.
 */

class B
{  
	B()
	{
		System.out.println("hello a");
	}  
	B(int x)
	{  
		this();  
		System.out.println(x);  
	}  
}  

public class ThisKey3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B(10);
	}

}
