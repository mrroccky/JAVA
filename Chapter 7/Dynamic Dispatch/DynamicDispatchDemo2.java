/* Write a program to demonstrate Dynamic dispatch.*/
class A
{
	void get()
	{
		System.out.println("You are in get method of A class");
	}
}
class B extends A
{
	void get()
	{
		System.out.println("You are in get method of B class");
	}
}
class C extends B
{
	void get()
	{
		System.out.println("You are in get method of C class");
	}
}
class DynamicDispatchDemo2
{
	 
    public static void main(String args[]) 
	{
	     A a1=new A();
		 a1.get();
		 a1=new B();
		 a1.get();
		 a1=new C();
		 a1.get();

	}
}