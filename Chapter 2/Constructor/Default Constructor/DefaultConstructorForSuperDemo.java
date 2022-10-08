/*Write a program to demonstrate every user define class contain super implicitly or explicitly.*/
class DefaultConstructorForSuperDemo
{
	DefaultConstructorForSuperDemo()
	{
		super();
		System.out.println("You called Default constructor of Super class i.e Object class");
	}
	public static void main(String args[])
	{
		DefaultConstructorForSuperDemo d=new DefaultConstructorForSuperDemo();
	}
}