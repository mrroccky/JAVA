/*Write a program to print table of enter number.*/
class PrintTableOfEntereNumberUsingForLoop
{
	public static void main(String args[]) 
	{
		int i,n;
        n=Integer.parseInt(args[0]);
		for(i=1;i<=10;i++)
		{
			System.out.println(n*i);
		}
	}
}