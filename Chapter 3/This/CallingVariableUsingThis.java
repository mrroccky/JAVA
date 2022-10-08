/*Write a program to call  variable using this.*/
class CallingVariableUsingThis 
{
	int a=10;
	void method(int a)
	{
	   System.out.println("Value of a="+a);
	}
    public static void main(String args[]) 
	{
		CallingVariableUsingThis t1=new CallingVariableUsingThis();
        t1.method(20);
		 
	}
}
