/*Write a program to calculate following series.
1+2+3+4………n.*/
class Series1
{
	public static void main(String[] args) 
	{
		int n,i,sum=0;
		n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of series is="+sum);
	}
}
