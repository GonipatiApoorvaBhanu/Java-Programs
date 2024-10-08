import java.util.*;
class Bikers
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of racers");
		int n=sc.nextInt();
		int []arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the speed of Racer "+i);
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		int avg=sum/n;
		System.out.println("The Average of all the Speeds is "+avg);
		for(int i=0;i<n;i++)
		{
			if(arr[i]>avg)
			{
			      System.out.println("The Racer "+i+" is Qualified with speed "+arr[i]);
			}
		}
	}
}
