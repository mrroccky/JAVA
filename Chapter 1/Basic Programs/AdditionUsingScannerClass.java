/*
  Write a program to perform Addition of number using Scanner class.
           OR
  Write a program to demonstrate Scanner class.
*/

import java.util.*;
class AdditionUsingScannerClass
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the a");
		a=Sc.nextInt();
		System.out.println("Enter the b");
		b=Sc.nextInt();
		c=a+b;
		System.out.println("Addition is="+c);
	}
}