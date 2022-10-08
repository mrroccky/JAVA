/* Write a program to calling Garbage Collector by assigning null reference to objects.*/
class CallingGarbageCollectorByAssigningNullReferenceToObjects
{
	protected void finalize()
	{
		System.out.println("Now you are in Finalize method.And Garbage collector is called before Object is destored");
	}
	public static void main(String args[]) 
	{
		CallingGarbageCollectorByAssigningNullReferenceToObjects g1,g2;
		g1=new CallingGarbageCollectorByAssigningNullReferenceToObjects();
		g2=new CallingGarbageCollectorByAssigningNullReferenceToObjects();
		g1=null;
		g2=null;
		System.gc();
		 
	}
}