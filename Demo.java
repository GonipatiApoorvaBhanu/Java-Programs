public class Demo
{
public static void main(String args[])
{
try
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
System.out.println("divison="+(a/b));
}
catch(ArrayIndexOutOfBoundsException abe)
{
System.out.println("you must enter two integer values" );
}
catch(NumberFormatException ne)
{
System.out.println("enter digits only"+ne.getMessage());
}
catch(ArithmeticException ae)
{
ae.printStackTrace();
System.out.println("Dont enter zerop for b");
}
catch(Exception e)
{
System.out.println("unknown exception"+e);
}
finally
{
System.out.println("finally block execcuted");
}
}
}


