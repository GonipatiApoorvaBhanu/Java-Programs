import java.util.*;
class  MergeSort
{
 void mergeSort(int[]a,int[]b,int[]c)
  {
		 int i=0,j=0,k=0,x;
		while(	i<a.length	&&	j<b.length	)
		  {
			if(a[i]<b[j])
			{
				c[k++]=a[i++];
			}
			else
			{
				c[k++]=b[j++];
			}
		  }
		  while(i<a.length)
		   {
			c[k++]=a[i++];
		  }
		 while(j<b.length)
		  {
			c[k++]=b[j++];
		  }
		for( x=0;x<c.length;x++)
		{
			System.out.println("Element in c[" +x+ "]:"+c[x]);
		 }
	     }
            }
           class  MergeSortDemo
           {
	     public static void main(String args[])
	      {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the First Array"+"	");
		int n1=sc.nextInt();
		System.out.println();
		System.out.print("Enter the size of the Second Array"+"	");
		int n2=sc.nextInt();
		System.out.println();
		int[] arr1=new int[n1];
		System.out.println("Enter Element into arr1 ");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int []arr2=new int[n2];
		System.out.println("Enter Element into arr2 ");
		for(int i=0;i<n2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.print("The First Array Elements are : ");
		for(int i=0;i<n1;i++)
		{
			System.out.print(arr1[i]+"	");
		}
		System.out.println();
		System.out.print("The Second Array Elements are : ");
		for(int i=0;i<n2;i++)
		{
			System.out.print(arr2[i]+"	");
		}
		System.out.println();
		MergeSort ms=new MergeSort();
		int n3=n1+n2;
		int[] merge=new int[n3];
		ms.mergeSort(arr1,arr2,merge);
     	  }
        }
          
