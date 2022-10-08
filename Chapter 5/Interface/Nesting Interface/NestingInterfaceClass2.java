/*
   Write a program to nest one interface to another inteface and implement nested interface. 
   And use Nesting of Interface to access interface and class methods.
*/
interface A
{
	void methodOfA();
	interface B
	{
		void methodOfB();
	}
}
class NestingInterfaceClass2 implements A.B
{
	void methodOfClass()
	{
		System.out.println("Now you are in method class that implements Interface B");
	}

	public void methodOfB()
	{
		System.out.println("You are implementing Body of Nested Interface B");
		methodOfClass();
	}
	public static void main(String args[]) 
	{
		A.B n1=new NestingInterfaceClass2();
		n1.methodOfB();
	}
}