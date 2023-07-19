package ExceptionHadling;

import java.util.*;

/*
 when exception occurr but nor handled by the catch block.
 Here, the code throws an exception however the catch block 
 cannot handle it.
 Despite this, the finally block is executed after the
 try block and then the program terminates abnormally.
 */

public class FinallyBlock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Inside the try block");
			int data=25/0;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block is always executed.");
		}
		
	}

}
