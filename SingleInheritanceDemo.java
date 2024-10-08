class Cars
{
 String name;
 public void speed()
 {
  System.out.println("Top speed is 191 MPH:");
 }
}
class BMW extends Cars
{
 public void display()
 {
  System.out.println("car name is"+ name);
 }
}
class SingleInheritanceDemo
{
  public static void main(String[] args)
 {
  BMW c1=new BMW();
  c1.name="2023 BMW M4 CS2";
  c1.display();
  c1.speed();
 }
}