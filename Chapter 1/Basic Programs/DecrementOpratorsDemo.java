/* Write a program to demonstrate Decrement operators.*/
class DecrementOpratorsDemo 
{
	public static void main(String args[]) 
	{
		int a=10,b,c=20,d;
	    System.out.println("Value of variable a before predecrement operator="+a);
		b=--a;
		System.out.println("Value of variable a after predecrement operator="+a);
		System.out.println("Value of variable b ="+b);
		System.out.println("Value of variable c before post predecrement operator="+c);
		d=c--;
		System.out.println("Value of variable d ="+d);
		System.out.println("Value of variable c after post predecrement operator="+c);

	    
     }
}