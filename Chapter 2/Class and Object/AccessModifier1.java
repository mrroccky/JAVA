/*
Write a program to demonstrate access modifier in class.
*/
class AccessModifier1 
{
	private int a=10,b=30;
	public void get()
	{
		System.out.println("Value of private variable a is="+a);
		System.out.println("Value of private variable b is="+b);
	}
}
class ClassForCallingAccessModifier1 
{
	public static void main(String args[])
	{
		AccessModifier1 a1=new AccessModifier1();
		a1.get();
	}
}
/*
Note:-
       1]Only class members can access it private members.
	   2]While accessing private data members method access specifier mode should be in 
	     protected ,public and default.
	  3]We can not access private variables or method directly throught Object.
*/