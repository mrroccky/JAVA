/*
   Write a program to access static variable using class name.
*/
class  AccessingStaticVariableUsingClassName 
{
	static int a;
}
class CallingAccessingStaticVariableUsingClassName
{
	public static void main(String args[]) 
	{
		System.out.println("Value of a is="+AccessingStaticVariableUsingClassName.a);
	}
}
