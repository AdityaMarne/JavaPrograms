package ExceptionHadling;

import java.util.*;

/*
Java finally block is a block used to execute important code 
such as closing the connection, etc.
Java finally block is always executed whether an exception is 
handled or not.
The finally block follows the try-catch block.
 */

public class FinallyBlock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int data=25/5;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block will be executed.");
		}
	}

}
