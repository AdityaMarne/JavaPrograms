package ObjectandClass;

/*
Java Program to demonstrate the working of a banking-system  
where we deposit and withdraw amount from our account.  
Creating an Account class which has deposit() and withdraw() methods
 */

class Account
{
	int acc_no;
	String name;
	float amount;
	
	//Method to assign value to class object
	void insert(int a,String n,float amt)
	{
		acc_no = a;
		name = n;
		amount = amt;
	}
	
	//deposit method
	void deposit(float amt)
	{
		amount = amount + amt;
		System.out.println(amt+"deposited");
	}
	
	//withdraw method
	void withdraw(float amt)
	{
		if(amount < amt)
		{
			System.out.println("Insufficient Balance");
		}else {
			System.out.println(amt + "withdraw");
			amount = amount - amt;
			System.out.println("Your crrent balnce is :"+amount);
		}
	}
	
	//method to check balance of the account
	void checkBalance()
	{
		System.out.println("Balance is :"+amount);
	}
	
	//method to display the values of an object  
	void display()
	{
		System.out.println(acc_no+" "+name+" "+amount);  
	}  
}

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account();
		a1.insert(832345, "Aditya", 3000);
		a1.display();
		a1.checkBalance();
		a1.deposit(1000);
		a1.checkBalance();
		a1.withdraw(4000);
		a1.checkBalance();
	}

}
