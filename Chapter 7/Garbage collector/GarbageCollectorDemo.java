/* Write a program to demonstrate Garbage Collector*/
class  GarbageCollectorDemo
{
	protected void finalize()
	{
		System.out.println("Now you are in Finalize method.And Garbage collector is called before Object is destored");
	}
	public static void main(String args[]) 
	{
		GarbageCollectorDemo g1;
		g1=new GarbageCollectorDemo();
		g1=null;
		System.gc();
	}
}
/*
   Note:-
          1] Garbage collector is used to destory the unused objects.
		  2] It is automatically invoked. When Object goes of scope.
		  3] It calls by Deamon thread.Deamon therad is lowest prority thread which is
		     called after all user threads.
		  4] Remember that finalize method is invoked by Garbage collector before unused Objects is destroyed.
		     Note:-Garbage collector calls Finalize method before it execute.
          5] Finalize method is used to free resources before objects is destoryed.
		  6] We can call Garbage collector explicitly by doing following Things.
		       1.By assigning null.
			      See CallingGarbageCollectorByAssigningNullReferenceToObjects.java Program for understanding.
			   
			   2.By assigning reference to another reference.
			       See CallingGarbageCollectorByAssigningOneReferenceToAnotherReference.java Program for understanding.
				   
			   3.By annonymous Object.
		  7] Garbage collector is called by using System.gc method explcitily.
*/