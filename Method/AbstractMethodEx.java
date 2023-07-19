package Method;

/*
 The method that does not has method body is known as abstract method
 In other words, without an implementation is known as abstract method.
 It always declares in the abstract class.
 It means the class itself must be abstract if it has abstract method.
 It means the class itself must be abstract if it has abstract method. 
 */

abstract class Demo //abstract class  
{  
//abstract method declaration  
abstract void display();  
}  

public class AbstractMethodEx extends Demo{

	//method impelmentation  
	void display()  
	{  
	System.out.println("Abstract method?");  
	}  
	
	public static void main(String args[])  
	{  
	//creating object of abstract class  
	Demo obj = new AbstractMethodEx();  
	//invoking abstract method  
	obj.display();  
	}  
}
