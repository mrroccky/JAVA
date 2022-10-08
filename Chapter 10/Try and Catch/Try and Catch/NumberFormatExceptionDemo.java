/*Write a program to demonstrate NumberFormatException*/
class NumberFormatExceptionDemo
{
	public static void main(String args[]) 
	{
		int a;
		try
		{
		    a=Integer.parseInt("chetan");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception is due wrong number format="+e);
		}
	}
}
