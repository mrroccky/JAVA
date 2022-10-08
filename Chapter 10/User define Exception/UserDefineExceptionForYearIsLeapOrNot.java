/*
    Write a program to create user define exception for  following
    If user enter year if year is not leap then it throw following Exception.
    “Year is not Leap”.
*/

import java.io.*;
class  MyException5 extends Exception
{
	MyException5(String a)
	{
		super(a);
	}
}
class UserDefineExceptionForYearIsLeapOrNot
{
	public static void main(String args[])
	{
		BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		int year;
		try
		{
			System.out.println("Enter the Year ");
		    year=Integer.parseInt(b1.readLine());
			if(year%4==0)
			{
				System.out.println("Entered year is leap");
			}
			else
			{
				
				throw new MyException5("Entered year is not leap");
			}
		}
		catch(MyException5 e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
		   System.out.println(e);
		}
   }
}
