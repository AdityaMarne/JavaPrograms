package ExceptionHadling;

public class TryCatchEg2 {
	TryCatchEg2()
	{
		try {
			int arr[]= {1,3,5,7};
			System.out.println(arr[10]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchEg2 obj=new TryCatchEg2();
	}

}
