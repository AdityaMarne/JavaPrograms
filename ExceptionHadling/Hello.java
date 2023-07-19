package ExceptionHadling;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello obj1=new Hello();
		obj1.case1(10, 0);
		obj1.case2(10, 0);
	}
	
	public void case1(int x,int y)
	{
		if( y != 0)
		{
		System.out.println(x/y);
		}else {
			System.out.println("The value of y is 0");
		}
		}
	
	public void case2(int x,int y)
	{
		try
		{
		System.out.println(x/y);
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}catch(Exception e) {
			System.out.println("The value of y is 0");
		}
	}

}
