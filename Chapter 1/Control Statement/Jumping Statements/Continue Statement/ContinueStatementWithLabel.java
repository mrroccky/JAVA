/*Write a program to demonstrate continue statement with label.*/
class  ContinueStatementWithLabel
{
	public static void main(String[] args) 
	{
		int i=1;
		outer:
		while(i<=10)
		{
			if(i==5)
			{
				i++;
				System.out.println("You are calling outer label of continue statement");
				continue outer;
			}
			else
			{
				System.out.println("Now you are not calling outer label of continue statement and value of i is="+i);
				i++;
			}
		}
	}
}
