//Program for parametarize constructor
import java.util.*;

public class ParametarizeCons {
	int id;
	String name;
	
	ParametarizeCons(int i,String n)
	{
		id = i;
		name = n;
	}
	
	void display()
	{
		System.out.println(id + "" + name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParametarizeCons pc1=new ParametarizeCons(1,"jkg");
		ParametarizeCons pc2=new ParametarizeCons(2,"guy");
		
		pc1.display();
		pc2.display();

	}

}
