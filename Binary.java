import java.util.*;
class Binary
{
	public static void main(String args[])
	{
		int i,low=0,high,mid,n,key;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements in array");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("The Sorted array elements are");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the Element to be searched");
		key=sc.nextInt();
		high=n-1;
		mid=(low+high)/2;
		while(low<=high)
		{
			if(a[mid]<key)
			{
				low=mid+1;
			}
			else if(a[mid]==key)
			{
				System.out.println("The Element is found at "+mid);
				break;
			}
			else
			{
				high=mid+1;
			}
			mid=(low+high)/2;
		}
		if(low>high)
		{
			System.out.println("Element is not found");
		}
	}
}
