/*
   Write a program to create user define exception for  following
   if Password is not match then it throw following  exception 
   “Password is not match”.
   And Computer will shutdown.
*/
import java.io.*;
class  MyException6 extends Exception
{
	MyException6(String a)
	{
		super(a);
	}
}
class UserDefineExceptionForPasswordMatch
{
	public static void main(String args[])
	{
		String password;
		String password1="Chetan";
		BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter the Passwod");
		    password=b1.readLine();
			if(password.equals(password1))
			{
				System.out.println("Password is match");
			}
			else
			{
				
				throw new MyException6("Password is not match");
			}
		}
		catch(MyException6 e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
		   System.out.println(e);
		}
		finally
		{
			try
			{
				Runtime r1=Runtime.getRuntime();
			    r1.exec("shutdown -r -t 2");
			}
			catch (IOException e)
			{
				System.out.println(e);
			}
			
		}
   }
}