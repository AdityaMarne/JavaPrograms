import java.util.*;

public class MulTwo{
	public static int Multiplication(int a,int b){
	return a*b; 
	}

	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a,b,mul;
	a = sc.nextInt();
	b = sc.nextInt();
		
	mul = Multiplication(a,b);
	System.out.println(mul);
	}
}