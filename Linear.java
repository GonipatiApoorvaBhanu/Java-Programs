import java.util.Scanner;
class Linear{
public static void main(String[] argv){
try{
Scanner sc=new Scanner(System.in);
boolean flag=false;
int a,x,n;
System.out.println("Enter no.of elements in Array: ");
n=sc.nextInt();
int ar[]=new int[n];
for( a=0;a<n;a++){
System.out.println("Enter Elements: ");
x=sc.nextInt();
ar[a]=x;
}
System.out.println("Elements are: ");
for(a=0;a<n;a++){
System.out.println( " "+ar[a]);
}
System.out.print("Enter Element to search: ");
int s=sc.nextInt();
for( a=0;a<n;a++){
if(s==ar[a]){
System.out.print( "Element found at "   );
 flag=true;
break;
}
}
if(!flag){
System.out.print("Not found!!");
}
}
catch(Exception e){
System.out.println( "Exception is" + e.getMessage());}
}
}
