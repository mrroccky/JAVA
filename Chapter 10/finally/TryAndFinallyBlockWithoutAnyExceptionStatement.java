/*Write a program to demonstrate finally block.*/
class TryAndFinallyBlockWithoutAnyExceptionStatement
{
	public static void main(String args[]) 
	{
		int a=30,b=0,c=1;
		try
		{
			System.out.println("Try body with exceptional statement");
		}
		finally
		{
			System.out.println("Finally block is executed");
		}
	}
}