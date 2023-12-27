package iNeuronAssignment;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if((i <= (n/2)) && (j <= n/2) && i<j) 
				{
					System.out.print("*");
				}else {
					System.out.print("");
				}
			}
			for(int j=0; j<n; j++)
			{
				if((j==0) && i>=(n/2)) 
				{
					System.out.print("*");
				}else {
					System.out.print("");
				}
			}
			for(int j=0; j<n; j++)
			{
				if(i == n-1 )
				{
					System.out.print("*");
				}else {
					System.out.print("");
				}	
			}
			for(int j=n-1; j<=(n/2); j--)
			{
				if(j == n-1 && i>=(n/2))
				{
					System.out.println("*");
				}else {
					System.out.println("");
				}
			}
			System.out.println();
		}
	}

}
