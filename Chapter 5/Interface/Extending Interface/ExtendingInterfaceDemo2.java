/*Write a program to demonstrate Extending Interface to another.*/
interface A1
{
    int a=10;
	void A();
}
interface B1 extends A1
{
	int b=20;
	void B();
}
class C2 implements B1
{

    public void A()
	{
		System.out.println("You are in implement method of A1");
		System.out.println("And Value of Interface A1 is="+a);
	}
	public void B()
	{
		System.out.println("You are in implement method of B1");
		System.out.println("And Value of Interface B1 is="+b);
	}
	void  C2()
	{
		System.out.println("Now We are calling implemented method of String");
		A();
		B();
	}
	public static void main(String args[])
	{
		C2 i1=new C2();
		i1.C2();
	}
}