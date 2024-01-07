package Assignment2;
import java.util.Scanner;


//5. WAP to sort an array using Merge Sort Algorithm.
class MergeSort
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
	
	void merge(int arr[],int begin, int mid, int end)
	{
		int i,j,k;
		
		int n1 = mid-begin+1;
		int n2 = end-mid;
		
		int LeftArray[] = new int[n1];
		int RightArray[] = new int[n2];
		
		for(i=0; i<n1; i++)
			LeftArray[i] = arr[begin+i];
		for(j=0; j<n2; j++)
			RightArray[j] = arr[mid+1+j];
		
		i=0;j=0;k=begin;
		
		while (i < n1 && j < n2)    
	    {    
	        if(LeftArray[i] <= RightArray[j])    
	        {    
	            arr[k] = LeftArray[i];    
	            i++;    
	        }    
	        else    
	        {    
	            arr[k] = RightArray[j];    
	            j++;    
	        }    
	        k++;    
	    }    
	    while (i<n1)    
	    {    
	        arr[k] = LeftArray[i];    
	        i++;    
	        k++;    
	    }    
	      
	    while (j<n2)    
	    {    
	        arr[k] = RightArray[j];    
	        j++;    
	        k++;    
	    }    
	}
	
	void sortArray(int arr[],int begin,int end)
	{
		if(begin < end)
		{
			int mid = (begin+ end) / 2;
			
			sortArray(arr,begin,mid);
			sortArray(arr,mid+1,end);
			
			merge(arr,begin,mid,end);
		}
	}
	
	void printArray(int arr[], int n)  
	{  
	    int i;  
	    for (i = 0; i < n; i++)  
	    	System.out.print(arr[i] + " ");  
	}  
}
public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSort ms=new MergeSort();
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of elements :");
		n = sc.nextInt();
		int arr[]=new int[n];
		
		ms.enterArrayElemnts(arr, n);
		//ms.arrayElemnts(arr, n);
		ms.sortArray(arr, 0, n-1);
		System.out.println("\nAfter sorting array elements are - ");  
		ms.printArray(arr, n);  

	}

}
