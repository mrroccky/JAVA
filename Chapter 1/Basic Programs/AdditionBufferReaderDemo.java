/*
   Write a program to perform Addition of number using BufferedReader class. 
                 OR
   Write a program to demonstrate BufferedReader class.
*/

import java.io.*;
class AdditionBufferReaderDemo 
{
	public static void main(String args[]) 
	{
	     int a,b,c;
		 BufferedReader b1;
	     b1=new BufferedReader(new InputStreamReader(System.in));
		 try
		 {
			
			System.out.println("Enter the a&b");
			a=Integer.parseInt(b1.readLine());
			b=Integer.parseInt(b1.readLine());
			c=a+b;
			System.out.println("Addition="+c);
			 

		  }
		 catch (IOException e)
		 {
			System.out.println("Exception is="+e);
		 }
	}
}