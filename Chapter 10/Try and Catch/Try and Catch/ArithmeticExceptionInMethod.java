/* 
  Write a program to demonstrate rethrowing Exception.
                    OR
  Write a program to handle Exception in another method rather than Exception
  occur in actual method.
*/
class RethrowingExceptionDemo
{
	int a,b,c;
	void divByZero(int a1,int b1)
	{
		a=a1;
		b=b1;
		c=a/b;
		System.out.println("Division is="+c);
	}
	public static void main(String[] args) 
	{
		ArithmeticExceptionInMethod a1=new ArithmeticExceptionInMethod();
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);

		try
		{
            a1.divByZero(a,b);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception is due to divid by Zero="+e);
		}
	}
}
