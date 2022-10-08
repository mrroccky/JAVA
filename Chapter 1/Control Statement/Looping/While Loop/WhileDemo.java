/*Write program to print numbers from 1 to n by using while loop.*/
class WhileDemo
{
	public static void main(String[] args) 
	{
		int i=1,n;
		n=Integer.parseInt(args[0]);
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}
}

