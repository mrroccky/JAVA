import java.io.*;
class  MyException6 extends Exception
{
	MyException6(String a)
	{
		super(a);
	}
}
class UserDefineExceptionForEvenOrNot
{
	public static void main(String args[])
	{
		BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		int no;
		try
		{
			System.out.println("Enter the Number");
		    no=Integer.parseInt(b1.readLine());
			if(no%4==0)
			{
				System.out.println("Entered number is even");
			}
			else
			{
				
				throw new MyException6("Number is Odd");
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
   }
}