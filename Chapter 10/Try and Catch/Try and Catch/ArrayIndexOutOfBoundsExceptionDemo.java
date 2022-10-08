/*Write a program to demonstrate ArrayIndexOutOfBoundsException.*/
class ArrayIndexOutOfBoundsExceptionDemo 
{
	public static void main(String args[]) 
	{
		int a[]={1,2,3,4,5};
		try
		{
			a[6]=20;
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception is due array index 6 is not present"+e);
		}
	}
}
