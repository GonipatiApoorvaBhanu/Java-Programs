class Person
{
	String name;
	String Father_name;
	String Mother_name;
	String Gender;
	int age;
	String email;
	String mobile_num;
	String address;
	Person(String name,String Father_name,String Mother_name,String Gender,int age,String email,String mobile_num,String address)
	{
		this.name=name;
		this.Father_name=Father_name;
		this.Mother_name=Mother_name;
		this.Gender=Gender;
		this.age=age;
		this.email=email;
		this.mobile_num=mobile_num;
		this.address=address;
	}
	void display()
	{
		System.out.println("Name is "+name);
		System.out.println("Father Name is "+Father_name);
		System.out.println("Mother Name is "+Mother_name);
		System.out.println("Gender is "+Gender);
		System.out.println("Age is "+age);
		System.out.println("email is "+email);
		System.out.println("Phone num is "+mobile_num);
		System.out.println("Address is "+address);
	}
}
public class PersonDetails
{
	public static void main(String[] args)
	{
		    Person  p1=new  Person("Apoorva","Raja","Janaki","Female",20,"apoorvabhanug@gmail.com","8143736901","Kakinada");
		System.out.println("Personal Information is : ");
		p1.display();
	}
}
