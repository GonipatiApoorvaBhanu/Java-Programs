import java.util.Scanner;
class Pal{
public static void main(String[] argv){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number: ");
int n=sc.nextInt();
String strNumber=Integer.toString(n);
int length =strNumber .length();
int r,s=0;
int temp=n;
for(int i=0;i<=n;i++){
System.out.println(strNumber.charAt(length - i - 1));
}
while( n!=0){
r=n%10;
s=s*10+r;
n=n/10;
}
if(temp==s){
System.out.println("**Palindrome**");
}
else{
System.out.println("!!Not!!");}
}
}
