/*Write a program to demonstrate Blank Final Variable.*/
class FinalBlankVariableDemo
{
	final int  a;
	FinalBlankVariableDemo()
	{
		a=40;
	}
	void display()
    {
		System.out.println("Value of final variable is="+a);
    }
	public static void main(String args[]) 
	{
		FinalBlankVariableDemo b=new FinalBlankVariableDemo();
		b.display();
		 
	}
}
/*
    Note:-
	       1] A final variable which is not initialize at time of declaration of variable but it must initialize
		      in body of constructor.
		   2] Blank final variable must not initialize in method of class.
*/