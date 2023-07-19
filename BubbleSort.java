import java.util.*;
public class BubbleSort{
	
	public static int sort(int n,int arr[])
	{
	  //Time Complexity = O(n^2)
	  for(int i=0; i<n; i++)
	  {
		for(int j=0; j<n-i-1; j++)
		{
		  if(arr[j] > arr[j+1])
		  {
			//Swap
			int temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
		  }
		}
	   }
		
	  for(int i=0; i<n; i++)
	  {
         	System.out.println(arr[i]);
	  }
	
	  return -1;
	}	

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements do you want :");
		int n;
		n = sc.nextInt();
	
		System.out.println("Enter array elements do you want :");
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}	

		System.out.println("Sorted array using Bubble Sort :");
		sort(n,arr);
	}
}