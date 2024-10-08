import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int x=sc.nextInt();
	int temp=x;
	int sum=0;
	while(temp>0)
	{
		int quo=temp/10;
		int rem=temp%10;
		temp=quo;
		sum+=rem*rem*rem;
	}
	if(sum==x)
	{
		System.out.println(x+" Is a ArmStrong Number");
	}
	else
	{
		System.out.println(x+" Is Not a ArmStrong Number");
	}
	}
}
