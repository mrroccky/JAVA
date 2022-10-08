/*Write a program to find factorial of number using while loop.*/
class FactorialUsingDoWhileLoop
{
	public static void main(String[] args) 
	{
		int i,n,fact=1;
		n=Integer.parseInt(args[0]);
		i=1;
		do
		{
			fact=fact*i;
			i++;
		}while(i<=n);
		
		System.out.println("Factorial is="+fact);
	}
}
