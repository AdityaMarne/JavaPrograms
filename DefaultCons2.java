//Program for default constructor
import java.util.*;

//The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.
public class DefaultCons2 {
		int id;
		String name;
		
		void display()
		{
			System.out.println(id+""+name);
		}
		
	public static void main(String[] args) {
		DefaultCons2 df1=new DefaultCons2();
		DefaultCons2 df2=new DefaultCons2();
		
		df1.display();
		df2.display();

	}

}
