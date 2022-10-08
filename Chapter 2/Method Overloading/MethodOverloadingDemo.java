/*Write a program to demonstrate method overloading.*/
class MethodOverLoadingDemo
{
	void method()
	{
		System.out.println("You are in method with no argument");
	}
	void method(int a)
	{
		System.out.println("You are in method with int parameter");
	}
	void method(double a)
	{
		System.out.println("You are in method with double parameter");
	}
	public static void main(String args[])
	{
		MethodOverLoadingDemo m1=new MethodOverLoadingDemo();
	    m1.method();
		m1.method(2);
		m1.method(2.1);
	}

}
