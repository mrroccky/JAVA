/*Write a program to demonstrate Return Statement*/
class ReturnStatementDemo 
{
	int a=10;
	int retunValueMethod()
	{
		return(a);
	}
	public static void main(String[] args) 
	{
		 ReturnStatementDemo r1=new ReturnStatementDemo();
		 System.out.println("Value of a is="+r1.retunValueMethod());
	}
}
