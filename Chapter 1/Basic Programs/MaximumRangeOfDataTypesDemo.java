/*Write a program to find Maximum Range of primitive data types in Java.*/
class MaximumRangeOfDataTypesDemo
{
	public static void main(String[] args) 
	{
		 int i,c;
		 double d;
		 short s;
		 long l;
		 float f;
		 byte b;
		 i=Integer.MAX_VALUE;
		 System.out.println("Maximum range of Integer(int)="+i);

		 f=Float.MAX_VALUE;
		 System.out.println("Maximum range of float="+f);

		 d=Double.MAX_VALUE;
		 System.out.println("Maximum range of double="+d);

		 l=Long.MAX_VALUE;
		 System.out.println("Maximum range of long="+l);

		 c=Character.MAX_VALUE;
		 System.out.println("Maximum range of Character(char)="+c);

		 b=Byte.MAX_VALUE;
		 System.out.println("Maximum range of byte="+b);

		 s=Short.MAX_VALUE;
		 System.out.println("Maximum range of short="+s);
	}
}
/*
    Note:-
			 1] By using MAX_VALUE constant we can find maximum range of primitive data types only.
			 2] We can not have MAX_VALUE constant for boolean data type.
			 3] So that we can not do like(i.e Boolean.MAX_VALUE is not applicable).
			 4] That simply means boolean data type do not have maximum and minimum range.
				That why we can not find maximum and minimum range.
*/		 
