/*Write a program to call static method  from another static method.*/
class CallingStaticMethodFromAnotherStaticMethod
{
	public static void main(String args[]) 
	{
		System.out.println("Calling static method from another static method");
		get();
	}
	static void get()
	{
		System.out.println("You are in static");
	}
}
