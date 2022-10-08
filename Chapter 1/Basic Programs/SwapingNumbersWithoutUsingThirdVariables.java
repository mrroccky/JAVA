/*Write a program to swap two numbers without using third variable.*/
class SwapingNumbersWithoutUsingThirdVariables
{
	public static void main(String args[])
	{
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		System.out.println("Value of a before swap="+a+"\nValue of b before swap="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a after swap="+a+"\nValue of b after swap="+b);
	}
}