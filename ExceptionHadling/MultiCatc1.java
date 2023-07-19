package ExceptionHadling;
import java.util.*;

/*
 A try block can be followed by one or more catch blocks. Each catch block must contain a different exception handler. 
 So, if you have to perform different tasks at the occurrence of 
 different exceptions.
 
 Points remember
 1.At a time only one exception occurs and at a time only one catch block is executed.
 2.Catch block follows order in case of multiple catch block.
*/

public class MultiCatc1
{
	public static void main(String args[])
	{
		try
		{
			int a[]=new int[5];
			a[5] = 30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arrithmatic exception Occured.");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index out of bound exception");
		}
		catch(Exception e)
		{
			System.out.println("Parent exception occurs");
		}
		System.out.println("Rest of the code.");
	}
}