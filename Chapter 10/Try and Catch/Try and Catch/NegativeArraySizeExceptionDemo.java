 /*Write a program to demonstrate NegativeArraySizeException.*/
class NegativeArraySizeExceptionDemo
{
	public static void main(String args[]) 
	{
		int a[];
		try
		{
			a=new int[-50];
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Exception is due negative Array Index="+e);
		}
	}
}