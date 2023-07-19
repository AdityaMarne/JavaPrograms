package AccessModifierParent;
/*
 If you make any class constructor private, 
 you cannot create the instance of that class
  from outside the class.
 */
import java.util.*;

class A{
	private A()
	{
	}
	 void msg()
	{
		System.out.println("Hello java");
	}
}
public class ConstructorPrivate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A objA=new A();//Compile Time Error  
		
	}

}
