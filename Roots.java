import java.util.*;
public class Roots
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Coefficient of x^2 ");
		int a=sc.nextInt();
		System.out.println("Enter the Coefficient of x ");
		int b=sc.nextInt();
		System.out.println("Enter the Constant ");
		int c=sc.nextInt();
		System.out.println("The Quadratic Equation you entered is "+a+"x^2"+b+"x"+c);
		double d=Math.sqrt(b*b-(4*a*c));
		double r1= (-b+d)/2*a;
		double r2= (-b-d)/2*a;
		if(d>0)
		{
			System.out.println("The Roots are Real and Unequal");
			System.out.println("The Roots are "+r1+" and "+r2);
		}
		else if(d==0)
		{
			System.out.println("The Roots are Real and Equal");
			System.out.println("The Roots are "+r1+" and "+r2);
		}
		else
		{
			System.out.println("The Roots are Imaginary");
		}
	}
}
