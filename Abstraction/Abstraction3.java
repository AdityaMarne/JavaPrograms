import java.util.*;

abstract class Bank
{
	abstract int getRateOfInterest();
}

class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}

class PNB extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}

public class Abstraction3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new SBI();
		System.out.println("Rate od interest of SBI :"+b.getRateOfInterest());
		b=new PNB();
		System.out.println("Rate od interest of PNB :"+b.getRateOfInterest());
		

	}

}
