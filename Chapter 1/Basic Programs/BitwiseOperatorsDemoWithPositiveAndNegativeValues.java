/*Write a program to demonstrate Bitwise operators with positive and negative values.*/
class BitwiseOperatorsDemoWithPositiveAndNegativeValues 
{
	public static void main(String args[]) 
	{
		int a=-50,b=3;
	    int r1,r2,r3,r4,r5,r6;
		r1=a&b;
		r2=a|b;
		r3=a^b;
		r4=~a;
		r5=a<<2;
		r6=a>>2;
		System.out.println("Bitwise AND operation with positive and negative value is="+r1);
		System.out.println("Bitwise OR with positive and negative value is="+r2);
		System.out.println("Bitwise Ex-OR operation with positive and negative value is="+r3);
		System.out.println("Bitwise ones complement operation with positive and negative value is="+r4);
		System.out.println("Bitwise left shift operation with positive and negative value is="+r5);
		System.out.println("Bitwise right shift operation with positive and negative value is="+r6);   
     }
}