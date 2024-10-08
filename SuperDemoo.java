import java.util.*;
class Rectangle
{
	int l,b;
	Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public int area()
	{
		return (l*b);
	}
}
class Cuboid extends Rectangle
{
	int h;
	Cuboid(int l,int b,int h)
	{
		super(l,b);
		this.h=h;
	}
	public int area()
	{
		int a=super.area();
		System.out.println("Area of Rectangle is "+a);
		return (l*b*h);
	}
}
class SuperDemoo
{
	public static void main(String[] g)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Length:");
		int l=sc.nextInt();
		System.out.println("Enter Breadth:");
		int b=sc.nextInt();
		System.out.println("Enter Height:");
		int h=sc.nextInt();
		Cuboid c=new Cuboid(l,b,h);
		int a=c.area();
		System.out.println("Area of Cuboid is "+a);
	}
}