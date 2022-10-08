/* Write a program to demonstrate Constructor in Single Inheritance. */
class A 
{
	A()
	{
	   System.out.println("Super class Constructor is Invoked");
	}
}
class B extends A 
{
	B()
	{ 
	   System.out.println("Sub class Constructor is Invoked");
	}
	public static void main(String args[])
	{
		B b1=new B();
	}
}
