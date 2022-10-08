/*
   Write a program to demonstrate abstract method. 
   And Calling method of abstract using of object abstract class.
*/
abstract class  AbstractClassDemo2
{
	abstract void get();
}
class Demo2 extends AbstractClassDemo2
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
		AbstractClassDemo2 d=new Demo2();
		d.get();
		d.display();
	}
}
/*
Note:-
        1] If we create object of abstract and assign instance of class then we can only 
           accessible only abstract method of abstract class.It must not access method of class.
		   If we are try to this then compiler must generate error.
		2] This program give error because we access method of class using abstract class object.
*/