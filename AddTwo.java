import java.util.*;

public class AddTwo{
	public static int Addition(int a,int b){
	int Sum;
	Sum = a + b;
	return Sum;
	}
	
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	
	int sum = Addition(a,b);
	System.out.println(sum);
	}
}