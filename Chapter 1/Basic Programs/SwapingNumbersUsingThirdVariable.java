/*Write a program to swap two numbers using third variable.*/
class SwapingNumbersUsingThirdVariables
{
	public static void main(String args[])
	{
			int a,b,c;
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			System.out.println("Value of a before swap="+a+"\nValue of b before swap="+b);
			c=a;
			a=b;
			b=c;
			System.out.println("Value of a after swap="+a+"\nValue of b after swap="+b);
	}
		 
}