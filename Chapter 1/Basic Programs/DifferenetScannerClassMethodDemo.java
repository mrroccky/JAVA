/*Write a program to demonstrate Different method of Scanner class to read different Data type value 
and for reading a string .
                           OR
Write a program to demonstrate following methods of Scanner class
1]nextByte()
2]nextBoolean()
3]nextDouble()
4]nextFloat()
5]nextLong()
6]netxLine()
7]nextInt()
8]nextShort()
*/

import java.util.*;
class DifferenetScannerClassMethodsDemo
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
		i=Sc.nextInt();
		System.out.println("Enter the value for Float data type");
		f=Sc.nextFloat();
		System.out.println("Enter the value for Double data type");
		d=Sc.nextDouble();
		System.out.println("Enter the value for Long data type");
		l=Sc.nextLong();
		System.out.println("Enter the value for Short data type");
		s=Sc.nextShort();
		System.out.println("Enter the value for Byte data type");
		b=Sc.nextByte();
		System.out.println("Enter the value for Boolean data type");
		bool=Sc.nextBoolean();
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
/*
Note:-
      1]Scanner class is present in import java.util  package(i.e when we use scanner class we must util package in the program).
	  2]Scanner class must contain at least one argument in constructor.Because There is not default constructor of Scanner class.
	  3]This class does throw Exception like BufferReader class.
	  4]There is no direct method to read character by using this class.
	  5]This class is used to handle enetered or (Buffere) level data.
	  6]We can use nextLine to read all data types value but it too hard understand and it increase coding.
*/