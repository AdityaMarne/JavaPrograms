import java.util.*;

public class TwoDArr{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter rows and col :");

	int row=sc.nextInt();
	int col=sc.nextInt();

	int matrix[][]=new int[row][col];
	
	System.out.println("Enter matrix elements :"); 
	for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
		matrix[i][j] = sc.nextInt();
	}
	}
	
	System.out.println("Enter elements which to find :");
	int x=sc.nextInt();
	
	for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
		if(matrix[i][j] == x)
		{
			System.out.println("X found at location ("+i+","+j+")");
		} 
	}
	}

	}
}