import java.util.Scanner;
class P{
public static void main(String[] argv){
Scanner sc=new Scanner(System.in);
System.out.println("Enter rows: ");
int rows=sc.nextInt();
System.out.println("Enter cols: ");
int cols=sc.nextInt();

for(int i=1;i<=rows;i++){
for(int j=1;j<=cols;j++){
if(i<=j){
System.out.print("*");
}
else{
System.out.print(" ");
}
}System.out.println();
}
}
}