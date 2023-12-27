package iNeuronAssignment;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i==0)
				{
					System.out.print("*");
				}else {
					System.out.print("");
				}
			}
			for(int j=(n/2); j>=0; j--)
			{
				if(i<(n/2) && i+j<=n/2)
				{
					System.out.print("*");
				}else {
					System.out.print("");
				}
			}
			for(int j=(n/2); j>=0; j--)
			{
				if(i>=(n/2) && i-j>=n/2)
				{
					System.out.print("*");
				}else {
					System.out.print("");
				}
			}
			for(int j=0; j<n; j++)
			{
				if(i==n-1)
				{
					System.out.print("*");
				}else {
					System.out.print("");
				}
			}
			System.out.println();
		}
	}

}
