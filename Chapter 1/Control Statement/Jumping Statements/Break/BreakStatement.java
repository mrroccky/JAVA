/*
Write a program to demonstrate break statement.
*/
class BreakStatement 
{
	public static void main(String[] args) 
	{
		int i;
		for(i=1;i<=10;i++)
		{
			if(i==5)
			{
			    break;
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}
