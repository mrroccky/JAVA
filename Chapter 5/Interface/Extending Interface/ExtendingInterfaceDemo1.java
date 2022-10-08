/*Write a program to demonstrate Extending Interface to another.*/
interface A1
{
	void A();
}
interface B1 extends A1
{
	void B();
}
class C1 implements B1
{

    public void A()
	{
		System.out.println("You are in implement method of A1");
	}
	public void B()
	{
		System.out.println("You are in implement method of B1");
	}
	void  C()
	{
		System.out.println("Now We are calling implemented method of String");
		A();
		B();
	}
	public static void main(String args[])
	{
		C1 i1=new C1();
		i1.C();
	}
}