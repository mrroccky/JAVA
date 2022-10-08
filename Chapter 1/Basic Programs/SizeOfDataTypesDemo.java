/*
   Write a program to display no. of bits require for Java data type.
                   OR
   Write a program to prove that Java is Architecture neutral Language.
*/ 
class SizeOfDataTypesDemo 
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
		System.out.println("Bits require for Integer(int) Data type is="+i);

		f=Float.SIZE;
		System.out.println("Bits require for float Data type is="+f);

		c=Character.SIZE;
		System.out.println("Bits require for Character(char) Data type is="+c);

		s=Short.SIZE;
		System.out.println("Bits require for short Data type is="+s);

		l=Long.SIZE;
		System.out.println("Bits require for long Data type is="+l);

		b=Byte.SIZE;
		System.out.println("Bits require for byte Data type is="+b);

		d=Double.SIZE;
		System.out.println("Bits require for double Data type is="+d); 
	}
}
/*
  Note:-
      1] This method does not work with boolean data type.
	  2] This method return size of primitive data types in bits.
*/
