/* Write a program to write try block along with finally block without catch block.*/
class TryBlockWithFinallyBlockWithoutCatchBlockDemo
{
	public static void main(String args[]) 
	{
		int a=30,b=0,c=1;
		try
		{
			c=a/b;
		}
		finally
		{
			System.out.println("Finally block is executed");
		}
	}
}