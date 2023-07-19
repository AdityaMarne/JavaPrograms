package ObjectandClass;

/*
 2]Object and Class E.g: Initialization through method
 
 We creating two objects of class and initializing the value
 to these objects by invoking the insertRecord method.
 */

class TestStudent2
{
	int rollno;
	String name;
	
	void insertRecord(int r,String n)
	{
		rollno = r;
		name = n;
	}
	
	void displayInfo()
	{
		System.out.println(rollno+" "+ name);
	}
}

public class Student4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStudent2 t1=new TestStudent2();
		TestStudent2 t2=new TestStudent2();
		
		t1.insertRecord(101, "Aditya");
		t2.insertRecord(102, "Vivek");
		
		t1.displayInfo();
		t2.displayInfo();
	}

}
