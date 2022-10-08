/*Write a program to demonstrate ArithmeticException.*/
class ArithmeticExceptionDemo 
{
	public static void main(String args[]) 
	{
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		try
		{
			c=a/b;
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception is due no/0="+e);
		}
	}
}
