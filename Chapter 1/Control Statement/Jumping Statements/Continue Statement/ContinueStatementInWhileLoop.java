/*Write a program to demonstrate continue in while loop.*/
class ContinueStatementInWhileLoop 
{
	public static void main(String[] args) 
	{
		int i=1,n;
		n=Integer.parseInt(args[0]);
		while(i<=n)
		{
			  
			 if(i==5)
			 {
				i++;
				continue;
			 }
			 else
			 {
				System.out.println(i);
				i++;
			 }
		}
	 }
}
