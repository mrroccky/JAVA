/*Write a program to find greatest number between two numbers using conditional operator.*/
class GreatestBetweenTwoNosUsingConditionalOperator
{
	public static void main(String args[]) 
	{
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
        c=a>b?a:b;
		System.out.println("Greatest no between Two no is="+c);
	}
}