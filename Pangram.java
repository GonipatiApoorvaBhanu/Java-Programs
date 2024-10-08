import java.util.Scanner;
public class Pangram{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("***Pangram***");
boolean[] isalphaFound=new boolean[26];
String str="Abcpqrwxyzdefghijklmnotuvs";
str=str.toLowerCase();
System.out.println("Enter a String:      ");
String s=sc.nextLine();
System.out.println("String is:    " +s);
s=s.toLowerCase();
System.out.println(s);
int index=0;
for(int i=0;i<str.length();i++){
if(str.charAt(i) >='a' && str.charAt(i) <='z'){
index=str.charAt(i)-'a';
System.out.println(index);
isalphaFound[index]=true;
}
}
int flag=0;
for(int i=0;i<isalphaFound.length;i++){
if(isalphaFound[i] ==false){
flag=1;
break;
}
}
if(flag==1){
System.out.println("Not Pangram!!");
}
else{
System.out.println("Pangram!!");
}
}
}