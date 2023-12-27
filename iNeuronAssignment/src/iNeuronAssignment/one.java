package iNeuronAssignment;

//1.Write a program(WAP) to print INEURON using pattern programming logic.
public class one {
	public static void main(String args[])
	{
		int n = 5;
		//This logic is for printing I
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i == 0 || j == (n-1)/2  || i == n-1)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("\t");
			
			//This logic is for printing N
			for(int j=0; j<n; j++)
			{
				if((i<n && j==0) || (i<n && j==n-1) || (i-1==j))
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("\t");
			
			//This logic is for printing E
			for(int j=0; j<n; j++)
			{
				if((i==0 && j<n) || (j==0) || (j<n && i==n-1) || (i == (n-1)/2 && j<n))
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("\t");
			//This logic is for printing U
			for(int j=0; j<n; j++)
			{
				if((i<n-1 && j==0) || (i<n-1 && j==n-1) || (i==n-1 && j>0 && j<n-1))
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("\t");
			//This logic is for printing R
			for(int j=0; j<n; j++)
			{
				if((i<n && j ==0) || (i==0 && j<n-1) || (i<(n+1)/2 && j==n-1) || (i==(n/2) && j<n-1)
					|| (i>=(n/2) && j>(n/2) && j <(n-1)))
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("\t");
			//This logic is for printing O
			for(int j=0; j<n; j++)
			{
				if((i==0 && j>0 && j<n-1) || (j==0 && i>0 && i<n-1) || (i==n-1 && j>0 && j<n-1)
					|| (j==n-1 && i>0 && i<n-1))
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("\t");
			//This logic is for printing N
			for(int j=0; j<n; j++)
			{
				if((i<n && j==0) || (i<n && j==n-1) || (i-1==j))
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
