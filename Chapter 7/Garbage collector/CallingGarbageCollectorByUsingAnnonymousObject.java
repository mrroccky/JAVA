/* Write a program to calling G.C by using Annonymous objects.*/
class CallingGarbageCollectorByUsingAnnonymousObject
{
	CallingGarbageCollectorByUsingAnnonymousObject()
	{
		System.out.println("You are in Constructor");
	}
	protected void finalize()
	{
		System.out.println("Now you are in Finalize method.And Garbage collector is called before Object is destored");
	}
	public static void main(String args[]) 
	{
		new CallingGarbageCollectorByUsingAnnonymousObject();
		System.gc();
	}
}