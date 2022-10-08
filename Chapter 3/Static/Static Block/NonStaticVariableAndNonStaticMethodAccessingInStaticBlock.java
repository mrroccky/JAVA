/*
  Write a program to demonstrate What happen when
  we access non static variables and non static methods in static block.
 */
class NonStaticVariableAndNonStaticMethodAccessingInStaticBlock 
{
	int a;
	static 
	{
	   System.out.println("Value of a="+a);
	   System.out.println("Now you are calling non static method get");
	}
	void get()
	{
		System.out.println("You are in non static  method");
	}
	public static void main(String args[]) 
	{
		System.out.println("Main method is Executed");
	}
}
/*
Note:-
      1] We can not access non static variables and method in static block.
	  2] If we try to this then compile time  error generate.
*/