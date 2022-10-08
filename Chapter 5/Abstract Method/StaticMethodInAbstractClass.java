/*
    Write a program to define static method in abstract class.
*/
abstract class  AbstractClassDemo5
{
	static void staticMethod()
	{
		System.out.println("You are static method");
	}
	abstract void get();
}
class Demo5 extends AbstractClassDemo5
{
	void get()
	{
		System.out.println("You are in Abstract method of AbstractClassDemo");
	}
	void display()
	{
		System.out.println("This is not abstract method");
	}
	public static void main(String args[])
	{
		Demo5 d=new Demo5();
		Demo5.staticMethod();
		d.get();
		d.display();
	}
}
 