public class StringBufferDemo2
{
  public static void main(String args[])
  {
    StringBuffer sb=new StringBuffer("Hi");
	sb.append("Hello");
	sb.append("Morning");
	System.out.println("before:"+sb);
	sb.insert(7,"good");
	System.out.println("after insert():"+sb);
	sb.replace(11,22,"Afternoon");
	System.out.println("after replace():"+sb);
	sb.delete(2,7);
	System.out.println("after delete():"+sb);
	}
}