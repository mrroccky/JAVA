/*Write a program to find greatest number among three numbers.*/
class GreatestNoAmongThreeNos
{
	public static void main(String args[]) 
	{
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		if(a>b&&a>c)
		{
			System.out.println("a is grestest");
		}
		else if(b>c)
		{
		  System.out.println("b is grestest");
		}
		else
		{
			System.out.println("c is grestest");
		}
	}
}
