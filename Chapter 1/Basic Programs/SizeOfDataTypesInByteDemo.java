/* 
    Write a program to display no. of Bytes require for Java data type.
                     OR
    Write a program to prove that Java is Architecture neutral Language
*/ 
class SizeOfDataTypesInByteDemo 
{
	public static void main(String[] args) 
	{
		int i,c;
		float f;
		short s;
		long l;
		byte b;
		double d;

		i=Integer.SIZE;
		System.out.println("Bytes require for Integer(int) Data type is="+i/8);

		f=Float.SIZE;
		System.out.println("Bytes require for float Data type is="+f/8);

		c=Character.SIZE;
		System.out.println("Bytes require for character(char) Data type is="+c/8);

		s=Short.SIZE;
		System.out.println("Bytes require for short Data type is="+s/8);

		l=Long.SIZE;
		System.out.println("Bytes require for long Data type is="+l/8);

		b=Byte.SIZE;
		System.out.println("Byte require for byte Data type is="+b/8);

		d=Double.SIZE;
		System.out.println("Bytes require for double Data type is="+d/8); 
	}
}
/*
  Note:-
       1] This method does not work with boolean data type.
	   2] This method return size of primitive data types in bit.
	   3] But we can display numbers of bytes required those data types by this method and divide result by 8.
*/
