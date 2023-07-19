package ObjectandClass;

/*
 1] Object and Class E.g:Initialization through reference
 
 Initializing an object means storing data into the objects.
 */

class TestStudent1
{
	int id;
	String name;
}

public class Student3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStudent1 t1=new TestStudent1();
		t1.id = 101;
		t1.name = "Aditya";
		
		TestStudent1 t2=new TestStudent1();
		t2.id = 101;
		t2.name = "Vivek";
		
		System.out.println("T1 id :"+t1.id+"and name:"+t1.name);
		System.out.println("T2 id :"+t2.id+"and name:"+t2.name);
	}

}
