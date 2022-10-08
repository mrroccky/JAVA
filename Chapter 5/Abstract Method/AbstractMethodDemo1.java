/*Write a program to demonstrate abstract method.*/
abstract class  AbstractClassDemo1
{
	abstract void get();
}
class Demo1 extends AbstractClassDemo1
{
	void get()
	{
		System.out.println("You are in Abstract method of AbstractClassDemo");
	}
	public static void main(String args[])
	{
		Demo1 d=new Demo1();
		d.get();
	}
}
/*
Note:-
       1] Abstract class is declared by using abstract keyword.
	   2] Abstract method must have abstract class.
	   3] Abstract class must not have need to  define abstract method.
	   4] Abstract class contain abstract method as well as normal method.
	   5] Methods which are declare as abstract must not  define body of those methods in that abstract class.
	   6] All abstract method  must define in extends in sub class.
	   7] We can not create object of abstract class.
	   8] But we can create  instance of abstract class.
	   9] But that must capable to access only methods of abstract class 
	      not methods of sub class.
	  10] Abstract class provide 0% to 100% abstraction but inteface provide 100% abstraction.
*/
