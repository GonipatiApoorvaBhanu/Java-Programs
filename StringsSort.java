import java.util.Scanner;
class StringsSort
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n;
  System.out.println("Enter no.of strings");
  n=sc.nextInt();
  String a[]=new String[n];
  for(int i=0;i<n;i++)
  {
    System.out.println("Enter String into a[" + i + "]:");
	a[i]=sc.next();
  }
  System.out.println("String before sort");
  for(int i=0;i<n;i++)
  {
   System.out.println("String at a[" + i +"] is:" +a[i]);
  }
  String temp;
  for(int i=0;i<n;i++)
  {
	for(int j=0;j<n-i-1;j++)
    {
     if(a[j].compareTo(a[j+1])>0)
     {
      temp=a[j];
      a[j]=a[j+1];
       a[j+1]=temp;
	 }
	}
   }
   System.out.println("Strings After sort");
   for(int i=0;i<n;i++)
   {
    System.out.println("String at a[" + i +"]is :"+a[i]);
   }
  }
}

