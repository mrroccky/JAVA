/*
  Write a program to create user define exception for  following
  If user enter age is negative then it throw following.
   “Age must not negative”.
*/
import java.io.*;
class  MyException4 extends Exception
{
	MyException4(String a)
	{
		super(a);
	}
}
class UserDefineExceptionForAgeIsNotNegative
{
	public static void main(String args[])
	{
		BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		int age;
		try
		{
			System.out.println("Enter the age ");
		    age=Integer.parseInt(b1.readLine());
			if(age>0)
			{
				System.out.println("Entered age is positive");
			}
			else
			{
				
				throw new MyException4("Age must not negative");
			}
		}
		catch(MyException4 e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
		   System.out.println(e);
		}
   }
}
