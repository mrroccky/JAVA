/*Write a program to find smallest number between two numbers.*/
class SmallestNoBetweenTwoNos 
{
	public static void main(String[] args) 
	{
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		if(a<b)
		{
			System.out.println("a is smallest");
		}
		else
		{
			 System.out.println("b is smallest");
		}
	}
}