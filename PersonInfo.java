class person
{
String name;
int age;
person()
{
System.out.println("zero param constuctor");
this.name="Apoorva";
this.age=20;
}
person(String name,int age)
{
	System.out.println("Parametrized constuctor");
	this.name=name;
	this.age=age;
}
void display()
{
	System.out.println("Name is "+(name));
	System.out.println("Age is "+(age));
}}
public class PersonInfo
{
	public static void main(String[] args)
	{
		person p1=new person();
		p1.display();
		person p2=new person("Ram",24);
		p2.display();
    }
}



