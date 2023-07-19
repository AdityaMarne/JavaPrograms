package ExceptionHadling;

import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
 In Java, using a try block inside another try block is permitted.
  It is called as nested try block.
 */

public class NestTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			try {
				System.out.println("Going to divide by 0");
				int b=35/0;
			}
			catch(ArithmeticException  e)
			{
				System.out.println(e);
			}
			
			try {
				int a[]=new int[5];
				a[5] = 4;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			
			System.out.println("other statement");
		}
		catch(Exception e)
		{
			System.out.println("Handle the exception (outer catch)");
		}
		System.out.println("Normal flow");
	}

}
