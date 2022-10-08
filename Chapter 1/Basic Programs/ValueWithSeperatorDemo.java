/*Write a program to demonstrate separator in assigning value.*/
class ValueWithSeperatorDemo
{
	public static void main(String args[]) 
	{
		int a=1_000_000;
        float b=2_200_312.34F;
		double c=3_200_312.34;
		int d=01_631;
		int e=0x1_632;
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
		System.out.println("Value of c="+c);
		System.out.println("Value of d variable of Octal Representation="+d);
		System.out.println("Value of e variable of Hexadecimal Representation="+e);
	}
}
/*
Note:-
      1] This program run only on JDK7 and above version of JDK.
	  2] We can not placed -(underscore) at end of literal(value).
	     if we will do that it gives error.
	  3] _ Between digit is as , in value that is generally used when human represent value.
	     like 10,000.
	  4] If you want write 1,00,000 in Java then statement become like below.
	     1,00,000--->In human represention.
		 1_00_000--->In Java represention.
      5] You can represent value contain '_' with octal and hexadecimal numbers.
	  6] And with Float and Double value.
	  7] But it can not applied to boolean data type.
*/
