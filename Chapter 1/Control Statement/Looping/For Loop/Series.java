/*Wap  a program to print sum of no till n*/
class Series
{
	public static void main(String[] args) 
	{
		int i,n,sum=0;
		n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of series is="+sum);
	}
}
