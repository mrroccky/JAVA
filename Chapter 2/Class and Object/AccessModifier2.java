/*
Write a program to demonstrate access private data members outside the
class and data members must have define in private access modifier. 
*/
class AccessModifier2 
{
	private int a=10,b=30;
}
class ClassForCallingAccessModifier2 
{
	public static void main(String args[])
	{
		AccessModifier2 a1=new AccessModifier2();
		System.out.println("Value of private variable a is="+a1.a);
		System.out.println("Value of private variable b is="+a1.b);
	}
}