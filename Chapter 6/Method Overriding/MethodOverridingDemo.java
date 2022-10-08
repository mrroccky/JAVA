/* Write a program to demonstrate Method overriding.*/
class SuperClass 
{
	void show() 
	{
		System.out.println("You are in method of show of Super class");
	}
}
class SubClass extends SuperClass
{
	void show() 
	{
		System.out.println("You are in method of show of Sub class");
	}
	public static void main(String args[])
	{
		SubClass s=new SubClass();
		s.show();
	}
}