class Cars
{
 String name1;
 String name2;
 public void supercars()
 {
  System.out.println("Both are supercars");
  }
}
class BMW extends Cars
{
 public void sportscar()
 {
  System.out.println("car name is"+name1);
 }
}
class BENZ extends Cars
{
 public void luxurycar()
 {
  System.out.println("Car name is"+name2);
 }
}
class MultilevelInheritanceDemo
{
 public static void main(String[] args)
 {
  BMW c1=new BMW();
  c1.name1="2023 BMW M4 CS2";
  BENZ c2=new BENZ();
  c2.name2="Mercceles-Maybach";
  c1.sportscar();
  c2.luxurycar();
  c1.supercars();
 }
}
