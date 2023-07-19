package ThisKeyword;

import java.util.*;

/*
5.this can be passed as argument in the constructor call.
-We can pass the this keyword in the constructor also.
It is useful if we have to use one object in multiple classes.
 */

class C
{
	ThisKey5 obj;
	C(ThisKey5 obj)
	{
		this.obj = obj;
	}
	void display()
	{
		System.out.println(obj.data);
	}
}

public class ThisKey5 {
	
	int data = 10;
	ThisKey5()
	{
		C c=new C(this);
		c.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKey5 a=new ThisKey5();
	}

}
