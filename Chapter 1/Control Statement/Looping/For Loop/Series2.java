/*Write a program to calculate Even series.
2+4+6……….n*/
class Series2
{
	public static void main(String[] args) 
	{
		int n,i,sum=0;
		n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
			   sum=sum+i;
			}
		}
		System.out.println("Sum of series is="+sum);
	}
}
