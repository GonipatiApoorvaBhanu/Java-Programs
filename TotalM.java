import java.util.*;
interface Internal
{
    public void internalmarks(int intmarks[]);
}
interface External
{
    public void externalmarks(int extmarks[]);
}
class Totalmarks implements Internal,External
{
    int inter[]=new int[5];
    int exter[]=new int[5];
    int sum[]=new int[5];
    public void internalmarks(int intmarks[])
    {
        for(int i=0;i<intmarks.length;i++)
        {
         inter[i]=intmarks[i];
        }
    }
    public void externalmarks(int extmarks[])
    {
        for(int i=0;i<extmarks.length;i++)
        {
            exter[i]=extmarks[i];
        }
    }
    public void total()
    {
        System.out.println("Total marks obtained in all 5 subjects");
        for (int i=0;i<5;i++)
        {
            sum[i]=inter[i]+exter[i];
            System.out.println("Total marks of subject "+(i+1)+" = "+sum[i]);
        }
    }
}
class TotalM
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of a student");
        String name=sc.nextLine();
        System.out.println("Enter the Roll number of a student");
        int rollno=sc.nextInt();
        int[] intmarks=new int[5];
        int[] extmarks=new int[5];
        System.out.println("Enter internal marks for 5 subjets");
        for(int i=0;i<5;i++)
        {
            intmarks[i]=sc.nextInt();
        }
        System.out.println("Enter external marks for 5 subjets");
        for(int i=0;i<5;i++)
        {
            extmarks[i]=sc.nextInt();
        }
        System.out.println("Name:"+name);
        System.out.println("Roll Number:"+rollno);
        Totalmarks tm=new Totalmarks();
        tm.internalmarks(intmarks);
        tm.externalmarks(extmarks);
        tm.total();
    }
}
                      




