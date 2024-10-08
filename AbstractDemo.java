//Abstract class Demo
abstract class Shape
{
 public void show()
 {
   System.out.println("I am Abstract class");
 }
 abstract public void area();
}
class Circle extends Shape
{
  public void area()
  {
    System.out.println("Circle area is "+ (3.14*7*7));
  }
}
class Square extends Shape
{
  public void area()
  {
    System.out.println("Square area is "+ (11*11));
  }
}
class Rectangle extends Square
{
  public void area()
  {
    System.out.println("Rectangle area is "+ (7*8));
  }
}
class AbstractDemo
{
 public static void main(String[] args)
 {
  Circle c1=new Circle();
  c1.area();
  Square s1=new Square();
  s1.area();
  Rectangle r1=new Rectangle();
  r1.area();
 }
}