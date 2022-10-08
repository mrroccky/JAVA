/*Write a program to read different data types value by using nextLine() method of Scanner class.*/
import java.util.*;
class ReadingValueOfDifferentDataTypesUsingNextLineMethod
{
	public static void main(String args[])
	{
		int i;
		float f;
		double d;
		long l;
		short s;
		byte b;
		boolean bool;
		String  StringObject;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the value for Integer data type");
		i=Integer.parseInt(Sc.nextLine());
		System.out.println("Enter the value for Float data type");
		f=Float.parseFloat(Sc.nextLine());
		System.out.println("Enter the value for Double data type");
		d=Double.parseDouble(Sc.nextLine());
		System.out.println("Enter the value for Long data type");
		l=Long.parseLong(Sc.nextLine());
		System.out.println("Enter the value for Short data type");
		s=Short.parseShort(Sc.nextLine());
		System.out.println("Enter the value for Byte data type");
		b=Byte.parseByte(Sc.nextLine());
		System.out.println("Enter the value for Boolean data type");
		bool=Boolean.parseBoolean(Sc.nextLine());
		System.out.println("Enter the String");
		StringObject=Sc.nextLine();
		System.out.println("Value Read by Scanner for Intger Data type is="+i);
		System.out.println("Value Read by Scanner for Float Data type is="+f);
		System.out.println("Value Read by Scanner for Double Data type is="+d);
		System.out.println("Value Read by Scanner for Long Data type is="+l);
		System.out.println("Value Read by Scanner for Short Data type is="+s);
		System.out.println("Value Read by Scanner for Byte Data type is="+b);
		System.out.println("Value Read by Scanner for Boolean Data type is="+bool);
		System.out.println("String Read by Scanner class="+StringObject);

	}
}
 