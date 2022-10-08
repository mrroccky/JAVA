/* Write a program to define abstract method and normal method.*/
abstract class NormalAndAbstractMethod
{
	abstract void get();
    void normalMethod()
	{
		System.out.println("You are normal method");
	}
}
class NormalAndAbstractMethodClass extends NormalAndAbstractMethod
{
	void get()
	{
		System.out.println("Abstarct method");
	}
	public static void main(String args[])
	{
		NormalAndAbstractMethodClass n1=new NormalAndAbstractMethodClass();
		n1.get();
		n1.normalMethod();
	}
}