/*Write a program to access static variable using object.*/
class AccessingStaticVariableUsingObject 
{
	static int a;
}
class CallingAccessingStaticVariableUsingObject
{
	public static void main(String args[]) 
	{
		AccessingStaticVariableUsingObject a1=new AccessingStaticVariableUsingObject();
		System.out.println("Value of a is="+a1.a);
	}
}
