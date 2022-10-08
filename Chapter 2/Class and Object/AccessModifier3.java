/*
Write a program to demonstrate access protected data members outside the
class and data members must have define in protected access modifier. 
*/
class AccessModifier3 
{
	protected int a=10,b=30;
}
class ClassForCallingAccessModifier3 
{
	public static void main(String args[])
	{
		AccessModifier3 a1=new AccessModifier3();
		System.out.println("Value of private variable a is="+a1.a);
		System.out.println("Value of private variable b is="+a1.b);
	}
}