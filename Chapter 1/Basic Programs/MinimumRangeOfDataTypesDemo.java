/*Write a program to find Minimum Range of primitive data types in Java.*/
class MinimumRangeOfDataTypesDemo
{
	public static void main(String[] args) 
	{
		 int i,c;
		 double d;
		 short s;
		 long l;
		 float f;
		 byte b;
		 i=Integer.MIN_VALUE;
		 System.out.println("Minimum range of Integer(int)="+i);

		 f=Float.MIN_VALUE;
		 System.out.println("Minimum range of float="+f);

		 d=Double.MIN_VALUE;
		 System.out.println("Minimum range of double="+d);

		 l=Long.MIN_VALUE;
		 System.out.println("Minimum range of long="+l);

		 c=Character.MIN_VALUE;
		 System.out.println("Minimum range of character="+c);
		 S
		 b=Byte.MIN_VALUE;
		 System.out.println("Minimum range of byte="+b);

		 s=Short.MIN_VALUE;
		 System.out.println("Minimum range of short="+s);
	}
}
/*
  Note:-
			1] By using MIN_VALUE constant we can find minimum range of primitive data types only.
			2] We can not have MIN_VALUE constant for boolean data type.
			3] So that we can not do like(i.e Boolean.MIN_VALUE is not applicable).
			4] That simply means boolean data type do not have maximum and minimum range.
			   That why we can not find maximum and minimum range.