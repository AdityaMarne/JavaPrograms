package Inheritance;

/*
When there is a chain of inheritance, it is known as 
multilevel inheritance.

example 
MultiLevelInherEx(BabyDog) class inherits the Dog class
which again inherits the Animal class(Declared in single 
inheritance example)so there is a 
multilevel inheritance.
 */


class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking");
	}
}
public class MultiLevelInherEx extends Dog
{
	void weep()
	{
		System.out.println("Weeping");
	}
	public static void main(String args[])
	{
		MultiLevelInherEx d=new MultiLevelInherEx();
		d.weep();
		d.bark();
		d.eat();
	}
	
	
}