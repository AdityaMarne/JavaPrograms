import java.util.*;

public class SelectionSort
{

	public static int sort(int n,int arr[])
	{
		//Time Complexity = O(n^2)
		for(int i=0; i<n-1; i++)
		{
			int smallest = i;
			for(int j=i+1; j<n; j++)
			{
				if(arr[smallest] > arr[j])
				{
					smallest = j;
				}	
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		

		System.out.println("Sorted Array :");
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}
	return -1;
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements :");
		int n;
		n = sc.nextInt();

		System.out.println("Enter array elements :");
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
	
		sort(n,arr);
	}
}