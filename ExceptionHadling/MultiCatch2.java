package ExceptionHadling;

import java.util.*;

public class MultiCatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]=new int[5];
			System.out.println(a[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic exception occured");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound exception occured");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception occur");
		}
		System.out.println("Rest of the code");
	}

}
