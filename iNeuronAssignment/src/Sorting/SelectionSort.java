package Sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {64,25,12,22,11};

		for(int i=0; i<arr.length; i++)
		{
		    int minValue = arr[i];
		    int index = i;
		    for(int j=i+1; j<arr.length; j++)
		    {
		        if(arr[j] < minValue)
		        {
		            minValue = arr[j];
		            index = j;
		        }
		    }
		    if(arr[i] > minValue)
		    {
		        arr[index] = arr[i];
		        arr[i] = minValue;
		    }
		    System.out.println(Arrays.toString(arr));
		    System.out.println("Index of minvalue: "+index);
		    System.out.println("Minvalue: "+minValue);
		}

		double arr1[] = {34.6, 7.2, 23.1, 32.8, 5.5, 62.9};

		for(int i=0; i<arr1.length; i++)
		{
		    double minValue = arr1[i];
		    int index = i;
		    for(int j=i+1; j<arr1.length; j++)
		    {
		        if(arr1[j] < minValue)
		        {
		            minValue = arr1[j];
		            index = j;
		        }
		    }
		    if(arr1[i] > minValue)
		    {
		        arr1[index] = arr1[i];
		        arr1[i] = minValue;
		    }
		    System.out.println(Arrays.toString(arr1));
		    System.out.println("Index of minvalue: "+index);
		    System.out.println("Minvalue: "+minValue);
		}
		
		char arr2[]={'g', 'e', 'n', 'i', 'a', 's'};
		
		for(int i=0; i<arr2.length; i++)
		{
		    char minValue = arr2[i];
		    int index = i;
		    for(int j=i+1; j<arr2.length; j++)
		    {
		        if(arr2[j] < minValue)
		        {
		            minValue = arr2[j];
		            index = j;
		        }
		    }
		    if(arr2[i] > minValue)
		    {
		        arr2[index] = arr2[i];
		        arr2[i] = minValue;
		    }
		    System.out.println(Arrays.toString(arr2));
		    System.out.println("Index of minvalue: "+index);
		    System.out.println("Minvalue: "+minValue);
		}

	}

}
