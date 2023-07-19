package Constructor;

/*
we are creating the no-arg constructor in the class.
It will be invoked at the time of object creation.
*/

class DefConstEx
{
	//creating a default constructor  
	DefConstEx()
	{
		System.out.println("Bike is running");
	}
	
	public static void main(String args[])
	{
		//calling a default constructor  
		DefConstEx d1=new DefConstEx();
	}
}