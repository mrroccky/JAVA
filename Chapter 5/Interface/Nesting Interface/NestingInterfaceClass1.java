/* Write a program to nest one interface to another inteface and implement nested interface. */
interface A
{
	void methodOfA();
	interface B
	{
		void methodOfB();
	}
}
class NestingInterfaceClass1 implements A.B
{
	public void methodOfB()
	{
		System.out.println("You are implementing Body of Nested Interface B");
	}
	public static void main(String args[]) 
	{
		NestingInterfaceClass1 n1=new NestingInterfaceClass1();
		n1.methodOfB();
	}
}
/*
   Note:-
           1] Nesting of interface is used to group of related inteface into main Interface.
		   2] Declaring interface to another interface is called Nesting of Interface.
		   3] Here we define Interface A in that Interface declare one method i.e methodOfA() and 
		      we declare Interface B.Within Inteface B there is one method i.e methodOfB.
           4] Then we wrote class NestingInterfaceClass1 implements A.B statement so it direct mean we 
		      implement B Interface So we must define method of Interface B.
			  if We define method of Interface A then Error will generate without defining body of method of Interface B.
*/