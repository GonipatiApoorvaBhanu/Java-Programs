import java.util.*;
public class Bubble
{
public static void main(String args[])
{
int i,j,n,t;
Scanner sc=new Scanner(System.in);
System.out.println("enter size of an array");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter "+n+" elements in array:");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
{
if(a[j]>a[j+1])
{
 t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
System.out.println("elements after sorting");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}
