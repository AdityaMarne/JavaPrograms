package StaticKeyword;

public class StaticVarEx
{
	int rollno;
	String name;
	static String college="BVP"; //Static variable
	
	 //constructor  
	StaticVarEx(int r, String n)
	{  
	  rollno = r;  
	  name = n;  
	}  
	
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	
	public static void main(String args[])
	{
		StaticVarEx s1=new StaticVarEx(111,"Aditya");
		StaticVarEx s2=new StaticVarEx(222,"Adnan");
		
		s1.display();
		s2.display();
	}
}