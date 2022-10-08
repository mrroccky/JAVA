/*Write a program to demonstrate interface. */
interface CallBack
{
	int a=10;
	void get();
} 
class InterfaceDemo1 implements CallBack 
{
	public void get()
	{
		System.out.println("You are implement body of get method of CallBack interface");
		System.out.println("And value of a in interface is="+a);
	}
	void demo()
	{
		System.out.println("This is not method of interface ");
	}
	public static void main(String args[])
	{
		InterfaceDemo1 i=new InterfaceDemo1();
		i.get();
		i.demo();
	}

}
/*
Note:-
         1] We want to declare interface in Java we must used interface keyword.
		 2] Those rules which applicable on declaring variable these rules are always applicable on
		   declare  interface.
		 3] We must not define body of method.We can declare method only.But we can define body of static method 
		    of interface only in JDK8 and onward.
		 4] All variable in interface is by default final (i.e public static final).
		 5] All methods in interface is by default abstract(public abstract).
		 6] We can not define constructor in interface because we have constructor of class.
		 7] Interface  must be implement not extends.
		 8] But we can extends interface to another inface.  
		 9] All variable in interface must be initialize because it by default final.
		 10] When we define body of methods of interface then we must write public infront of those methods.
		 11] We can declare interface with empty body called Marker interface.
		 12] Some Marker interfaces are Serializable, Clonnable and Remote  which are provided by Java.
		 13] Java does not provide mutiple inheritance directly due to ambiguity but this type of
		     inheritance can be achive by interface.
		 14] We can define static method and default and static method from JDK8.
		 15] We can not  create instance of interface but we create object of interface.
*/

