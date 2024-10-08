import java.util.*;
public class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int r=sc.nextInt();
		int n1=0;
		int n2=1; 
		int sum=0;
		System.out.println("The Even Fibnocci Numbers are ");
		for(int i=0;i<=r;i++)
		{
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			if(n3<r)
			{
				if(n3%2==0)
				{
					System.out.println(n3);
					sum+=n3;
				}
			}
			else
			{
				break;
			}
		}
		System.out.println("The Sum of Even Fibnocci Numbers are "+sum);
	}
}
