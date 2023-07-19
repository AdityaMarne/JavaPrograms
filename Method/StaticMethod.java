package Method;

/*
 A method that has static keyword is known as static method.
 In other words, a method that belongs to a class rather than
 an instance of a class is known as a static method.
 We can also create a static method by using the keyword static
 before the method name.
 The main advantage of a static method is that we can call it
 without creating an object.
 It is used to create an instance method.
 */

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			show();
	}
	
	static void show()   
	{  
	System.out.println("It is an example of static method.");  
	}  
}
