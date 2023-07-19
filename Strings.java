import java.util.*;

public class Strings{
	public static void main(String args[]){
	StringBuilder sb=new StringBuilder("Tony");
	System.out.println(sb);

	//char at index 0
	System.out.println(sb.charAt(0));

	//set char at index
	sb.setCharAt(0,'p');
	System.out.println(sb);

	//insert fun
	sb.insert(0,'s');
	System.out.println(sb);

	sb.insert(2,'n');
	System.out.println(sb);

	//delete the char
	sb.delete(2,3);
	System.out.println(sb);
	
	sb.delete(2,4);
	System.out.println(sb);

	//Append the char
	sb.append("e");
	System.out.println(sb);
	
	//Calculate length
	System.out.println(sb.length());
	}
}