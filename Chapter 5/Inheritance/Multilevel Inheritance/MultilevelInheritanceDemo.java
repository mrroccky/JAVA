/* Write a program to demonstrate multilevel inheritance.*/
class A 
{
	void MethodOfA()
	{
		System.out.println("You are in Super Class");
	}
}
class B extends A
{
	void MethodOfB()
	{
		System.out.println("You are in between super Class and sub class");

	}
}
class C extends B
{
	void MethodOfC()
	{
		System.out.println("You are in sub class");

	}
	public static void main(String args[])
	{
		C c1=new C();
		c1.MethodOfA();
		c1.MethodOfB();
		c1.MethodOfC();
	}
}
