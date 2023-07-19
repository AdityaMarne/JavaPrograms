package ThisKeyword;

import java.util.*;

/*
Usage of this keyword
1.this can be used to refer current class instance variable.
-The this keyword can be used to refer current class instance variable.
If there is ambiguity between the instance variables and parameters,
this keyword resolves the problem of ambiguity.

*/
class Student
{
	int rollno;
	String name;
	float fee;
	Student(int rollno,String name,float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}
}

public class ThisKey1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(111,"sdf",500f);
		Student s2=new Student(112,"sdf",500f);
		s1.display();
		s2.display();
	}

}
