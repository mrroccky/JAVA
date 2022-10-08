 /*Write a program to find greatest nos among three numbers using condition operator*/
class GreatestBetweenThreeNosUsingConditionalOperator
{
	public static void main(String args[]) 
	{
		int a,b,c,d,e;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
        d=a>b?a:b;
		e=c>d?c:d;
		System.out.println("Greatest no Among Three no is="+e);
	}		
}
