import java.util.Scanner;
class Hol{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter no.of rows:");
int a=sc.nextInt();
for(int i=0;i<a;i++){
for(int j=0;j<a;j++){
if( i==0 || i==a-1||j==0||j==a-1){
System.out.print(" * ");
}
else{
System.out.println("");
}
 System.out.println();
}
}
}
}
