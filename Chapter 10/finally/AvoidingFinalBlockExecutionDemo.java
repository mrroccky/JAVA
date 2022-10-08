/* Write a program to demonstrate how to avoid execution of finally block.*/
class AvoidingFinalBlockExecutionDemo
{
	public static void main(String args[]) 
	{
		int a=30,b=0,c=1;
		try
		{
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is due to:-"+e);
			System.exit(0);
		}
		finally
		{
			System.out.println("Finally block is executed");
		}
	}
}