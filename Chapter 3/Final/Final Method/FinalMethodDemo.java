/*Write a program to demonstrate  final method*/
class A
{
    final void get() 
	{
		System.out.println("Method of get of Super Class");
	}
}
class B extends A 
{
	void get() 
	{
		System.out.println("Method of get of Sub  Class");
	}
	public static void main(String args[]) 
	{
		B b1=new B();
		b1.get();
	}
}
/*-------------------------------------------------------------------------------
Output:-
         1] get() in  B can not override get() in A
 ---------------------------------------------------------------------------------/*
 
 /*
 Note:-
         1] Final method must overide .that mean Super(Base)class method declare in final then we can not define
		    method of same in Sub class.If we try to do this compiler must give error.
*/
