
/*
  Write a program to create user define exception for checking enter string is match or not to "Java" String 
  if match is not found then then it throws
    "No Match Found   
     Exception".
  Use super class of Exception(i.e Throwable).
 */
import java.io.*;
class MyException3 extends Throwable
{
	MyException3(String a)
	{
		super(a);
	}
}
class UserDefineExceptionForStringMatching3
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
			   throw new MyException3("No Match Found Exception");
			}
		}
		catch (Throwable  e)
		{
			System.out.println(e);
		}
		 
	}
}
