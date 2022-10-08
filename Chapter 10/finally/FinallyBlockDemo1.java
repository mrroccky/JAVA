/*Write a program to demonstrate finally block.*/
class FinallyBlockDemo
{
	public static void main(String args[]) 
	{
		int a=30,b=0,c=1;
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
/*
   Note:-
          1] Finally block is used to run part of code when Exception is occured.
		  2] Finally block must executed if Exception and also Exception do not came.
		  3] There is no another statement between try and finally body or catch and finally body.
		  4] For each try block there are one or mutiple catch blocks.but there is only one finally block is present.
		  5] In the case of we use default handler exception then there is no need to write catch block we can direct 
		     write finally block like.
			   try
		      {
			    c=a/b;
		      }
			  finally
		      {
			    System.out.println("Finally block is executed");
		      }
			  Note:-Please see following Program File for Understanding.
			        TryBlockWithFinallyBlockWithoutCatchBlockDemo.java

		 6] In following cases finally block must not executed.
		     1] If fatal error occure that abort process.
			 2] When we use System.exit.
			 Note:-Please see following Program File for Understanding.
			       AvoidingFinalBlockExecutionDemo.java  

		 7] Another way to write try and finally when we do not put exeception causing statement in try block.
		    Note:-Please see following Program File for Understanding.
			       TryAndFinallyBlockWithoutAnyExceptionStatement.java  

		 
*/
