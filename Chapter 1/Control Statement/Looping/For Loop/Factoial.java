/*Write a program to find Factorial of enter number.*/
class Factoial
{
	public static void main(String args[])
	{
		int n,i,fact=1;
		n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is="+fact);
	}
}