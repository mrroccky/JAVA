/*
  Write a program to demonstrate throws keyword.       
*/
import java.io.*;
class ThrowsDemo2
{
	public static void main(String args[]) throws ArithmeticException,IOException
	{
		int a=30,b=0,c;
		c=a/b;
		System.out.println("Division is="+c);
	}
}