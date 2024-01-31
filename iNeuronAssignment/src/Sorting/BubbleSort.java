package Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {34, 7, 23, 32, 5, 62};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
			{
				int swap;
				if(arr[j] > arr[j+1])
				{
					swap = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = swap;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		double arr1[] = {34.6, 7.2, 23.1, 32.8, 5.5, 62.9}; 
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1.length-i-1; j++)
			{
				double swap;
				if(arr1[j] > arr1[j+1])
				{
					swap = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = swap;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		
		char arr2[]={'g', 'e', 'n', 'i', 'a', 's'};
		for(int i=0; i<arr2.length; i++)
		{
			for(int j=0; j<arr2.length-i-1; j++)
			{
				char swap;
				if(arr2[j] > arr2[j+1])
				{
					swap = arr2[j];
					arr2[j] = arr2[j+1];
					arr2[j+1] = swap;
				}
			}
		}
		System.out.println(Arrays.toString(arr2));
		
		String arr3[] = {"apple", "dog", "cat", "car", "boy", "atom"};
		for(int i=0; i<arr3.length; i++)
		{
			for(int j=0; j<arr3.length-i-1; j++)
			{
				String swap;
				if(arr3[j].compareTo(arr3[j+1]) > 0)
				{
					swap = arr3[j];
					arr3[j] = arr3[j+1];
					arr3[j+1] = swap;
				}
			}
		}
		System.out.println(Arrays.toString(arr3));
		
		
		
        /*double arr4[] = {34.6, 7.2, 23.1, 32.8, 5.5, 62.9}; 
        boolean swapped;
        for(int i=0; i<arr4.length-1; i++)
        {
            swapped = false;
            for(int j=0; j<arr4.length-i-1; j++)
            {
                if(arr4[j] > arr4[j+1])
                {
                    double swap = arr4[j];
                    arr4[j] = arr4[j+1];
                    arr4[j+1] = swap;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then the array is sorted.
            if(!swapped) break;
        }
        System.out.println(Arrays.toString(arr4));
		*/

	}

}
