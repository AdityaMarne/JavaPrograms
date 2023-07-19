package ThisKeyword;

import java.util.*;
/*
4.this can be passed as an argument in the method call.
-The this keyword can also be passed as an argument in the method
 */
class S2
{
	void m(S2 obj)
	{
		System.out.println("Menthod is invoked");
	}
	void p()
	{
		m(this);
	}
}

public class ThisKey4 {

	public static void main(String args[])
	{
		S2 s1=new S2();
		s1.p();
	}
}
