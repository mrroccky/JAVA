/*Write a program to demonstrate Bitwise operators with negative value only.*/
class BitwiseOperatorsDemoWithNegativeValuesOnly 
{
	public static void main(String args[]) 
	{
		int a=-2,b=-1;
	    int r1,r2,r3,r4,r5,r6;
		r1=a&b;
		r2=a|b;
		r3=a^b;
		r4=~a;
		r5=a<<-2;
		r6=a>>-1;
		System.out.println("Bitwise AND operation with negative value is="+r1);
		System.out.println("Bitwise OR with negative value is="+r2);
		System.out.println("Bitwise Ex-OR operation with negative value is="+r3);
		System.out.println("Bitwise ones complement operation with negative value is="+r4);
		System.out.println("Bitwise left shift operation with negative value is="+r5);
		System.out.println("Bitwise right shift operation with negative value is="+r6);   
     }
}