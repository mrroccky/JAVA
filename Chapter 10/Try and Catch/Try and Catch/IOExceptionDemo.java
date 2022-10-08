/*Write a program demonstrate IOException.*/
import java.io.*;
class IOExceptionDemo
{
		String name;
		int roll_no;
		BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		void get()
		{
			try
			{
				System.out.println("Enter the name");
				name=b1.readLine();
				System.out.println("Enter the roll no");
				roll_no=Integer.parseInt(b1.readLine());
			}
			catch (IOException e)
			{
				System.out.println(e);
			}
		}
		void display()
	    {
			System.out.println("Name="+name);
			System.out.println("Roll no="+roll_no);
		}
		public static void main(String args[])
	    {
			IOExceptionDemo s1=new IOExceptionDemo();
			s1.get();
			s1.display();
		}
}