/*Write a program to demonstrate finally block.*/
class FinallyBlockDemo2
{
	public static void main(String args[]) 
	{
		int a=30,b=20,c=1;
		try
		{
			c=a/b;
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception is due no/0="+e);
		}
		finally
		{
			System.out.println("Finally block is executed");
		}
	}
}