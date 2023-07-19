import java.util.*;

abstract class Shape
{
	abstract void draw();
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing rectangle");
	}
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("Circle rectangle");
	}
}

public class Abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Circle();
		s.draw();

	}

}
