import java.util.Scanner;
class Exam{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String:  ");
String s=sc.next();
System.out.println(s.toLowerCase());
System.out.println(s.toUpperCase());
try{
for(int i=0;i<s.length();i++){
System.out.print(s.charAt(i));
Thread.sleep(1000);
}
}
catch(Exception ae){
System.out.println("OOPS!!");
}
}
}


