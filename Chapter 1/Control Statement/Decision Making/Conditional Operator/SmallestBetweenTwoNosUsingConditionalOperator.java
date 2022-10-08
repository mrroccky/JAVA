/*Write a program to find smallest number between two numbers using conditional operator.*/
class SmallestBetweenTwoNosUsingConditionalOperator
{
	public static void main(String args[]) 
	{
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
        c=a<b?a:b;
		System.out.println("Smallest no between Two no is="+c);
	}
}