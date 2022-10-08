/* Write a program to call G.C by assign one reference to another.*/

class CallingGarbageCollectorByAssigningOneReferenceToAnotherReference
{
	protected void finalize()
	{
		System.out.println("Now you are in Finalize method.And Garbage collector is called before Object is destored");
	}
	public static void main(String args[]) 
	{
		CallingGarbageCollectorByAssigningOneReferenceToAnotherReference g1,g2;
		g1=new CallingGarbageCollectorByAssigningOneReferenceToAnotherReference();
		g2=new CallingGarbageCollectorByAssigningOneReferenceToAnotherReference();
		System.out.println("Now finalize method is calling by G.C(Garbage collector)");
		g2=g1;
		System.gc();
		 
	}
}