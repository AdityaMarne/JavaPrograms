package Assignment2;
import java.util.Scanner;
import java.util.Arrays;
//3. WAP to sort an array using Bubble Sort Algorithm.
class Bubbule_Sort
{
	Scanner sc=new Scanner(System.in);
	
	void elements(int arr[],int n)
	{
		System.out.println("Enter the elements :");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	
	void sortElements(int arr[],int n)
	{
		System.out.println("Elemts after Bubble sorting :");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.print(Arrays.toString(arr));
	}
	
	
}

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bubbule_Sort b=new Bubbule_Sort();
		
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("Enter the number of elemnts :");
		n = sc.nextInt();
		
		int arr[]=new int[n];
		
		b.elements(arr, n);
		System.out.println("Elements after sorting");
		b.sortElements(arr, n);
	}

}
