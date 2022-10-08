/*Write a program to find greatest number between two numbers.*/
class GreatestNoBetweenTwoNos
{
	public static void main(String[] args) 
	{
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		if(a>b)
		{
			System.out.println("a is greatest");
		}
		else
		{
			 System.out.println("b is greatest");
		}
	}
}