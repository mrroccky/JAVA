/*Write a program to find enter number is Prime or Not.*/
class PrimeNo
{
	public static void main(String args[])
	{
		int n,i,flag=1;
		n=Integer.parseInt(args[0]);
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("No is Prime");
		}
		else
		{
			System.out.println("No is not Prime");
		}
	}
}