/*
  Write a program to demonstrate throws keyword.
          OR
  Write a program to handle ArithmeticException using throws keyword.
*/
class ThrowsDemo1
{
	public static void main(String args[]) throws ArithmeticException
	{
		int a=30,b=0,c;
		c=a/b;
		System.out.println("Division is="+c);
	}
}
/*
   Note:-
          1] Throws keyword is used when we do not want try and catch body.
		  2] Throws keyword only handle Checked Exception.
		     But My point of view throws handle both exception cheked and unchecked.
		  3] By using this we can handle mutiple Exception but only one exception is executed.
		  4] We can write Exception class without using Exception causing statement.
		     Note:-Please see following Program File for Understanding.
			        ThrowsDemo2.java

*/