package Searching;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		int element = 30;
		boolean flag = false;
		
		for(int i=0; i<arr.length; i++)
		{
			if(element == arr[i])
			{
				i++;
				System.out.println("Element fount at :"+i);
				flag = true;
				break;
			}
		}
		if(flag == false)
		{
			System.out.println("Element is not present in the array.");
		}
		
	}

}
