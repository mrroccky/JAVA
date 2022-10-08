/* Write a program to call static method using class name */
class StaticMethodDemo1 
{
	static void staticMethod() 
	{
	   System.out.println("You are in Static method");
	}
}
class CallingStaticMethodDemo1
{
	public static void main(String[] args) 
	{
        StaticMethodDemo1.staticMethod();	 
	}
}