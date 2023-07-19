import java.util.*;
//Example of static variable
public class StaticVar {
		int rollno = 1;
		String name = "fy";
		static String college = "ITS";
		
		StaticVar(int r,String n)
		{
			rollno = r;
			name = n;
		}
		void display()
		{
			System.out.println(rollno+" "+name+" "+college);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar sv1=new StaticVar(1,"hjgj");
		StaticVar sv2=new StaticVar(2,"gjsdf");
		sv1.display();
		sv2.display();
	}

}
