/*
   Write a program to handle following Exceptions.
    1.ArithmeticException.
    2.ArrayIndexOutOfBoundsException.
*/
class HandlingArithmeticExceptionAndArrayIndexOutOfBoundsExceptionDemo
{
	public static void main(String args[]) 
	{
		int a,b,c,index;
		int array[]={1,2,3,4,5};
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		index=Integer.parseInt(args[2]);
        try
		{
			c=a/b;
			array[index]=30;

		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception due no/0="+e);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception due Array Index Out Of Bound to ="+e);
		}
	}
}
