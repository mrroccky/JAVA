/*
   Write a program to create user define exception for checking enter string is match or not
   to "Java" String.
   if match is not found then then it thrown
   "No Match Found Exception".
 */
class MyException1 extends Exception
{
	MyException1(String a)
	{
		super(a);
	}
}
class UserDefineExceptionForStringMatching1
{
	public static void main(String args[])
	{
		String name1;
		String name2="Java";
		name1=args[0];
		try
		{
			if(name1.equals(name2))
			{
				System.out.println("String is match");
			}
			else
			{
			   throw new MyException1("No Match Found Exception");
			}
		}
		catch (MyException1 e)
		{
			System.out.println(e);
		}
	}

}
