/*Write a program to demonstrate NullPointerException.*/
class NullPointerExceptionDemo
{
    void get()
	{
       System.out.println("You are in get method of NullPointerExceptionDemo class.");
	}
}
class CallingNullPointerExceptionDemoClass
{
	public static void main(String args[])
	{
		NullPointerExceptionDemo n1=null;
		try
		{
			n1.get();
		}
		catch (NullPointerException e)
		{
			System.out.println("Exception is due to="+e);
		}
	}

}