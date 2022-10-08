/*Wap a program to calculate following  series
   1+1/2!+1/3!..........1/n!*/
class Series5
{
	public static void main(String[] args) 
	{
		int n,i,fact=1;
		double sum=1,term;
		n=Integer.parseInt(args[0]);
		for(i=2;i<=n;i++)
		{
			fact=fact*i;
			term=(double)1/fact;
			sum=sum+term;
		}
		System.out.println("Sum of series is="+sum);
	}
}