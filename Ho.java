import java.util.Scanner;
class Hol
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter no.of rows:");
int a=sc.nextInt();
for(int i=0;i<=a;i++){
for(int j=0;j<i;j++){
if(j=1||j=3||j=5)
System.out.print(" * ");
}
}
System.out.println();
}
}
}