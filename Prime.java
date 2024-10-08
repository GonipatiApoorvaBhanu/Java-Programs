import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int x=sc.nextInt();
		for(int n=1;n<=x;n++)
		{
		int flag=0;
		for(int i=2;i<=n/2;i++)
		{
		 if(n%i==0)
		 {
			 flag=1;
			 break;
		 }
		}
		if(flag==0)
		{
			System.out.println(n+" Prime");
		}
		}
	}
}
