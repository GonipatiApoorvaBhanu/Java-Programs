 import java.util.Scanner;
class InvalidAgeException extends Exception
{
public InvalidAgeException(String msg)
{
super(msg);
}
}
public class MyException
{
static void validate(int age) throws InvalidAgeException
{
if(age<18)
{
throw new InvalidAgeException("Age is not valid to vote");
}
else
{
System.out.println("Welcome to vote");
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
try
{
System.out.print("Enter Your Age:");
int age=sc.nextInt();
validate(age);
}
catch(InvalidAgeException ia)
{
System.out.println("Caught the Exception");
System.out.println("Exception occured: "+ia.getMessage());
ia.printStackTrace();
}
}
}

