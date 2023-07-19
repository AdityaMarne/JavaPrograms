package ObjectandClass;

/*
 
 Object and Class E.g: main outside the class
 
 In real time we create classes and use it from another class. 
 It is better approach.
 where we are having main() method in another class.
 */

class TestStudent
{
	int id;
	String name;
}


public class Student1 {

	public static void main(String args[])
	{
		TestStudent t1=new TestStudent();
		System.out.println(t1.id);
		System.out.println(t1.name);
	}
}
