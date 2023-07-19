package ObjectandClass;

/*
Oabject and Class E.g: main with in the class


We have created a Student class which has two data members id
and name. We are creating the object of the Student class by
new keyword and printing the objects value.
Here, we are creating a main() inside the class.

*/

public class Student {
	
	//Defining fields
	int id;
	String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student aditya=new Student(); //Creating an object or instance
		
		//Printing values of the object
		System.out.println(aditya.id);
		System.out.println(aditya.name);
	}

}
