/*Write a program to demonstrate interface. */
interface CallBack
{
	public static final int a=10;
	public abstract void get();
} 
class InterfaceDemo2 implements CallBack 
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
		InterfaceDemo2 i=new InterfaceDemo2();
		i.get();
		i.demo();
	}

}

