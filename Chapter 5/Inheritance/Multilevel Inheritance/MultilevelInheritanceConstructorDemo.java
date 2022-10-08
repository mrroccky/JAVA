class A 
{
	A()
	{
		System.out.println("You are in Super Class Constructor");
	}
}
class B extends A
{
	B()
	{
		System.out.println("You are in between super Class and sub class Constructor");

	}
}
class C extends B
{
	C()
	{
		System.out.println("You are in sub class Constructor");

	}
	public static void main(String args[])
	{
		C c1=new C();
	}
}
