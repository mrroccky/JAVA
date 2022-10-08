/*
    Write a program to tell what happen if declare class as final.
*/
final abstract class  AbstractClassDemo4
{
	abstract void get();
}
class Demo4 extends AbstractClassDemo4
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
		Demo4 d=new Demo4();
		d.get();
		d.display();
	}
}
/*
Note:-
        1] We can not define abstract class as final  because abstract class never inherit.
*/