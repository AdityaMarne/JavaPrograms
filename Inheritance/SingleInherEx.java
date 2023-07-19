package Inheritance;

/*
When a class inherits another class,it is known as a 
single inheritance.
example 
SingleInherEx(Dog) class inherits the Animal class, so there is the 
single inheritance.
*/

class Animal
{
	void eat()
	{
		System.out.println("Eating");
	}
}

public class SingleInherEx extends Animal
{
	void bark()
	{
		System.out.println("Barking");
	}
	
	public static void main(String args[])
	{
		SingleInherEx d=new SingleInherEx();
		d.bark();
		d.eat();
	}
}