/*Write a program to call method using this.*/
class CallingMethodUsingThis
{
	void method1()
	{
	   System.out.println("Method 1 is executed");
	   method2();
	}
	void method2()
	{
	   System.out.println("Method 2 is executed");
	}
    public static void main(String args[]) 
	{
		CallingMethodUsingThis n1=new CallingMethodUsingThis();
        n1.method1();
		 
	}
}
