/*
    Write a program to demonstrate constructor in abstract class.  
*/
abstract class  AbstractClassDemo3
{
    AbstractClassDemo3()
	{
		System.out.println("You are constructor of abstract class");
	}
	abstract void get();
}
class Demo3 extends AbstractClassDemo3
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
		Demo3 d=new Demo3();
		d.get();
		d.display();
	}
}