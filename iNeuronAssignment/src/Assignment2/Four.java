package Assignment2;
import java.util.Arrays;
import java.util.Scanner;

//4. WAP to sort an array using Selection Sort Algorithm.
class SelectionSort
{
	Scanner sc=new Scanner(System.in);	
	
	void enterArrayElemnts(int arr[],int n)
	{
		int elem;
		System.out.println("Enter elemnts :");
		for(int i=0; i<n; i++)
		{
			elem = sc.nextInt();
			arr[i] = elem;
		}
	}
	
	void arrayElemnts(int arr[],int n)
	{
		System.out.println("Elemnts of array :");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]);
		}
	
	}
	
	void sortArray(int arr[],int n)
	{
		System.out.println("Elemts after selection sorting :");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(arr[i] < arr[j])
				{
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort ss=new SelectionSort();
		
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of elements :");
		n = sc.nextInt();
		int arr[]=new int[n];
		
		ss.enterArrayElemnts(arr, n);
		//ss.arrayElemnts(arr, n);
		ss.sortArray(arr, n);
	}
}
