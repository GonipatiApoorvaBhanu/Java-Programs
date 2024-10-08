class values
{
int add(int x,int y)
{
	return(x+y);
}
int add(int x,int y, int z)
{
	return(x+y+z);
}
float add(float x, float y)
{
	return(x+y);
}
float add(float x, int y)
{
	return(x+y);
}
}
public class MethodOverload
{
	public static void main(String[] args)
	{
		values v1=new values();
		System.out.println("add is "+v1.add(60,50));
		System.out.println("add is "+v1.add(70,60,50));
		System.out.println("add is "+v1.add(2.5f,3.8f));
		System.out.println("add is "+v1.add(5.68f,60));
}}
