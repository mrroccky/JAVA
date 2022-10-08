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
class DynamicDispatchDemo1
{
	 
    public static void main(String args[]) 
	{
	     A a1=new A();
		 B b1=new B();
		 C c1=new C();
		 a1.get();
		 a1=b1;
		 a1.get();
		 a1=c1;
		 a1.get();
	}
}