/*
Write a program to demonstrate continue statement.
               OR
Write a program to demonstrate continue in for loop. 
*/
class ContinueStatementInForLoop 
{
	public static void main(String[] args) 
	{
		int i;
		for(i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}
