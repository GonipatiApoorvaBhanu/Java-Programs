import java.util.Scanner;
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
  return(l*b);
 }
}
class cube extends Rectangle
{
 int h;
 cube(int l,int b,int h){
 super(l,b);
 this.b=b;
 this.h=h;
 }
 public int area()
 {
 int a1=super.area();
 System.out.println("Area of Rectangle is "+a1);
 return(l*b*h);
 }
}
class SuperDemo
{
 public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter length");
 int l=sc.nextInt();
 System.out.println("enter Breadth ");
 int b=sc.nextInt();
 System.out.println("enter Height ");
 int h=sc.nextInt();
 cube c=new cube(l,b,h);
 int a1=c.area();
 System.out.println("Area of cube is "+a1);
 }
}
