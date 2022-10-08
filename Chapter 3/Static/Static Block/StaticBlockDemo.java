/*  Write a program to demonstrate Static block in Java.*/
class StaticBlockDemo 
{
	static 
	{
	   System.out.println("Static block  is Executed");
	}
	public static void main(String args[]) 
	{
		System.out.println("Main method is Executed");
	}
}
/*
Note:-
         1] We can declare static block in Java.
		 2] Static blocks is executing before main method.
		 4] After completing execution of static block.Then main method is execute.
		 5] Till JDK 6 we can run Java programs without main method. 
		 6] Static block only capable of accessing only static data(static variable and static method).
*/