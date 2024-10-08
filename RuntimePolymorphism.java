abstract class Shape
{
	//concrete method 
	public void show()
	{
		System.out.println("I am abstract class");
	}
	abstract public void area();//abstract method
}
class Circle extends Shape
{
	public void area()
	{
		System.out.println("Circle area is "+(3.14*7*7));
	}
}
class Square extends Shape
{
	public void area()
	{
		System.out.println("Square area is "+(7*7));
	}
}
class Rectangle extends Shape
{
	public void area()
	{
		System.out.println("Rectangle area is "+(10*15));
	}
}
class RuntimePolymorphism
{
	public static void main(String[] args)
	{
		Shape s;
	    s=new Circle();
		s.area();
		s=new Square();
		s.area();
		s=new Rectangle();
		s.area();
	}
}