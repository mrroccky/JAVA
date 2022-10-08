/*Write a program to overide method using super */
class  SuperClassMethod
{
	void show()
	{
		System.out.print("Now you are in super class show method");
	}
	
}
class  SubClassMethod extends SuperClassMethod
{
	 void show()
	{
		 super.show();
		System.out.print("Now you are in sub class show method");
	}
	
	public static void main(String args[])
	{
		SubClassMethod s1=new SubClassMethod();
		s1.show();
	}
}
