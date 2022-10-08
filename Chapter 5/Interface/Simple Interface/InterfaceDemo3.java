/* 
   Write a program to demonstrate interface. 
   And Calling method of Interface and class where interface implemented using object of Interface.
*/
interface CallBack
{
    int a=10;
	void get();
} 
class InterfaceDemo3 implements CallBack 
{
	void demo()
	{
		System.out.println("This is not method of interface ");
	}
	public void get()
	{
		System.out.println("You are implement body of get method of Callback interface");
		System.out.println("and value of a in interface is="+a);
	}
	
	public static void main(String args[])
	{
	    CallBack c=new InterfaceDemo3();
		c.get();
		c.demo();
	}

}
/*
Note:-
        1] If we create object of interface and assign intance of class then we can only 
           accessible only methods of interface .It must not access method of class.
		   If we are try do two this then compiler must generate error.
		2] This program give error because we access method of class using interface object.
*/
