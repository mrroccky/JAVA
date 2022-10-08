/*Write program to find enter number is Armstrong or not. */
class ArmstrongNumber
{
	public static void main(String[] args) 
	{
		int n,d,cube,org,sum=0;
		n=Integer.parseInt(args[0]);
		org=n;
		while(n>0)
		{
		    d=n%10;
			cube=d*d*d;
			sum=sum+cube;
			n=n/10;
		}
		if(org==sum)
		{
			System.out.println("Entered no is Armstrong");
		}
		else
		{
		  System.out.println("Entered no is not Armstrong");
		}
	}
}

