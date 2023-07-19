package Constructor;

/*
A constructor which has a specific number of parameters is 
called a parameterized constructor.

The parameterized constructor is used to provide different 
values to distinct objects.However, you can provide the same 
values also.

we have created the constructor of class that have two parameters.
*/

class ParaConstEx
{
	int id;
	String name;
	
	//Creating a parameterized constructor
	ParaConstEx(int id,String name)
	{
		//this is used to assign value to global variables.
		this.id = id;
		this.name =name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String args[])
	{
		ParaConstEx p1=new ParaConstEx(111,"Aditya");
		ParaConstEx p2=new ParaConstEx(222,"Adnan");
		
		p1.display();
		p2.display();
	}
}