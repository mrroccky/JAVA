/*Write a program to demonstrate ArrayStoreException*/
class ArrayStoreExceptionDemo
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5},i;
		try
		{
			a[2]=true;
		}
		catch (ArrayStoreException e)
		{
			System.out.println("Exception is due Wrong(incompatible) data value store in Integer Array="+e);
		}
	}
}