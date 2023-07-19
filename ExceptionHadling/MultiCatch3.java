package ExceptionHadling;

import java.util.*;

public class MultiCatch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]=new int[5];
			a[5] = 30/0;
			System.out.println(a[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Excption occur.");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bounds exception occue.");
		}
		catch(Exception e)
		{
			System.out.println("Parent exception occuers");
		}
		System.out.println("Rest of the code.");
	}

}
