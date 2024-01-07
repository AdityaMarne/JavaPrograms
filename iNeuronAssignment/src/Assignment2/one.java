package Assignment2;

import java.util.Scanner;

//1. WAP to find the duplicates present in an array.
public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String str1;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string :");
		str1 = sc.nextLine().replace(" ", "");
		
		char ch[]=str1.toCharArray();

		for(int i=0; i<ch.length; i++)
		{
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i] == ch[j])
				{
					System.out.println(ch[j]);
					break;
				}
			}
		}
	}

}
