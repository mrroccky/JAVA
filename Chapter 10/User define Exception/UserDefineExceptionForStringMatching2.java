/*
   Write a program to create user define exception for checking enter string is match or not
   to "Java" String.
   if match is not found then then it thrown
   "No Match Found Exception".
 */
import java.io.*;
class MyException2 extends Exception
{
	MyException2(String a)
	{
		super(a);
	}
}
class UserDefineExceptionForStringMatching2
{
	public static void main(String args[])
	{
		String name1;
		String name2="Java";
		BufferedReader b1;
		try
		{
			b1=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the String");
			name1=b1.readLine();
			if(name1.equals(name2))
			{
				System.out.println("String is match");
			}
			else
			{
			   throw new MyException2("No Match Found Exception");
			}
		}
		catch (MyException2 e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
		   System.out.println(e);
		}
	}
}
