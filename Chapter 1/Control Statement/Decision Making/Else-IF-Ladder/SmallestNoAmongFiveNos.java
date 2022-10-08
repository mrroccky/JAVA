/*Write a program to find smallest number among five numbers.*/
class SmallestNoAmongFiveNos 
{
	public static void main(String args[]) 
	{
		int a,b,c,d,e;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		d=Integer.parseInt(args[3]);
		e=Integer.parseInt(args[4]);
		if(a<b&&a<c&&a<d&&a<e)
		{
			System.out.println("a is smallest");
		}
		else if(b<c&&b<d&&b<e)
		{
		  System.out.println("b is smallest");
		}
		else if(c<d&&c<e)
		{
		  System.out.println("c is smallest");
		}
		else if(d<e)
		{
		  System.out.println("d is smallest");
		}
		else
		{
			System.out.println("e is smallest");
		}
	}
}
 