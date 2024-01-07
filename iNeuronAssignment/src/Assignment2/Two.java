package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

//2. WAP to sort an array using Quick Sort Algorithm.

class QuickSort
{
	static int partition(int arr[],int low,int high)
	{
		// choose the rightmost element as pivot
	    int pivot = arr[high];
	    
	    // pointer for greater element
	    int i = (low - 1);
	    // compare each element with pivot
	    
	    for (int j = low; j < high; j++)
	    {
	      if (arr[j] <= pivot) 
	      {
	        // if element smaller than pivot is found
	        // swap it with the greatr element pointed by i
	        i++;

	        // swapping element at i with element at j
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	      }
	    }

	 // swapt the pivot element with the greater element specified by i
	    int temp = arr[i + 1];
	    arr[i + 1] = arr[high];
	    arr[high] = temp;

	    // return the position from where partition is done
	    return (i + 1);
	}
	
	static void quickSort(int arr[],int low, int high)
	{
		if(low < high)
		{
			int pivot = partition(arr,low,high);
			
			// recursive call on the left of pivot
		    quickSort(arr, low, pivot - 1);

		    // recursive call on the right of pivot
		    quickSort(arr, pivot + 1, high);
		}
	}
}

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int elements[]= { 8, 7, 2, 1, 0, 9, 6};
		System.out.println("Elements of unsorted array :");
		System.out.println(Arrays.toString(elements));
		
		int size = elements.length;
		//System.out.println(size);
		QuickSort.quickSort(elements, 0, size-1);
		
		System.out.println("Sorted Array in Ascending Order: ");
	    System.out.println(Arrays.toString(elements));
		
	}

}
