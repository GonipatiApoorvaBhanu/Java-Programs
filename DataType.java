public class DataType
{
	boolean b;
	String sr;
	byte z;
	short s;
	int x;
	long l;
	float f;
	double d;
	public static void main(String args[])
	{
	    DataType d1=new DataType();
		System.out.println("The Default Values of primitive DataTypes");
		System.out.println("=========================================");
		System.out.println("The Default Value of boolean "+d1.b);
		System.out.println("The Default Value of String "+d1.sr);
		System.out.println("The Default Value of byte "+d1.z);
		System.out.println("The Default Value of short "+d1.s);
		System.out.println("The Default Value of int "+d1.x);
		System.out.println("The Default Value of long "+d1.l);
		System.out.println("The Default Value of float "+d1.f);
		System.out.println("The Default Value of double "+d1.d);
	}
}
