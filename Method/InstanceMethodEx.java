package Method;

/*
The method of the class is known as an instance method.
It is a non-static method defined in the class.

 */

public class InstanceMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceMethodEx obj=new InstanceMethodEx();
		
		System.out.println("The sum is:"+obj.add(12,13));
	}
	
	int s;
	
	//user-defined method because we have not used static keyword  
	public int add(int a, int b)  
	{  
		s = a+b;  
		//returning the sum  
		return s;  
	}  

}
