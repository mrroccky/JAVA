/*Write a program to demonstrate Increment operators.*/
class IncrementOperatorsDemo 
{
	public static void main(String args[]) 
	{
		int a=10,b,c=20,d;
	    System.out.println("Value of variable a before preincrement operator="+a);
		b=++a;
		System.out.println("Value of variable a after preincrement operator="+a);
		System.out.println("Value of variable b ="+b);
		System.out.println("Value of variable c before post increment operator="+c);
		d=c++;
		System.out.println("Value of variable d ="+d);
		System.out.println("Value of variable c after post increment operator="+c);
     }
}