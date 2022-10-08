/*Write a program to demonstrate Bitwise operators with positive and negative values.*/
class BitwiseOperatorsWithBooleanDataType
{
	public static void main(String args[])
	{
		boolean a=true,b=false;
		boolean r1,r2,r3;
		r1=a&b;
		r2=a|b;
		r3=a^b;
		System.out.println("Bitwise AND operator with boolean data type is="+r1);
		System.out.println("Bitwise OR operator with boolean data type is="+r2);
		System.out.println("Bitwise EX-OR operator with boolean data type is="+r3);
	}
}
/*
  Note:-
        1] We can use only Bitwise AND(&), Bitwise OR(|), Bitwise EX-OR(^) along with boolean data type.
		2] We can not use Bitwise left shift(<<) and right shift(>>) and one's complement (~) operator along with boolean data type.
		3] Result of mention in above operators must evalute boolean value.
*/      