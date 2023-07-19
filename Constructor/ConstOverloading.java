package Constructor;

class ConstOverloading
{
	int id;
	String name;
	int age;
	
	//creating two arg constructor  
	ConstOverloading(int id,String name){  
    this.id = id;  
    this.name = name;  
    }  
	
	//creating three arg constructor  
	ConstOverloading(int id,String name,int age){  
    this.id = id;  
    this.name = name; 
    this.age = age;
    }
	
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
	
	public static void main(String args[])
	{
		ConstOverloading c1=new ConstOverloading(111,"Aditya");
		ConstOverloading c2=new ConstOverloading(222,"Adnan",23);
		
		c1.display();
		c2.display();
	}
}