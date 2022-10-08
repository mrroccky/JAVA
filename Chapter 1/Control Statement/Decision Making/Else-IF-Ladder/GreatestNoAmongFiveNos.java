/*Write a program to find greatest number among five numbers.*/
class GreatestNoAmongFiveNos 
{
	public static void main(String args[]) 
	{
		int a,b,c,d,e;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		d=Integer.parseInt(args[3]);
		e=Integer.parseInt(args[4]);
		if(a>b&&a>c&&a>d&&a>e)
		{
			System.out.println("a is greatest");
		}
		else if(b>c&&b>d&&b>e)
		{
		  System.out.println("b is greatest");
		}
		else if(c>d&&c>e)
		{
		  System.out.println("c is greatest");
		}
		else if(d>e)
		{
		  System.out.println("d is greatest");
		}
		else 
		{
			System.out.println("e is greatest");
		}
	}
}