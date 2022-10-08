/*Write a program to calculate following series.
1-2+3-4+………n.*/
class Series6 
{
	public static void main(String[] args) 
	{
		int sum=0,i,n;
		n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum+(i*-1);
			}
			else
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum is="+sum);
	}
}