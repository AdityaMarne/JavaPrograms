package Searching;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50,60,70,80};
		int key=25;
		int low = 0;
		int high = arr.length-1;
		
		while(low < high)
		{
			int mid = (low+high)/2;
			if(key == arr[mid])
			{
				mid++;
				System.out.println("Key "+key+" found at index "+mid);
				break;
			}else if(key < arr[mid])
			{
				high = mid-1;
			}else if(key > arr[mid])
			{
				low = mid+1;
			}
		}
		if(low > high)
		{
			System.out.println("Key not found");
		}
	}

}
