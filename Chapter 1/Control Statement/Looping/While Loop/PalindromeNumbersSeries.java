/*Write program to print  Palindrome number from  1 to n.*/ 
class PalindromeNumbersSeries
{
	public static void main(String[] args) 
	{
		int n,d,sum=0,i,n1;
		n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{
			n1=i;
			while(n1>0)
			{
				d=n1%10;
				sum=sum*10+d;
				n1=n1/10;
			}
			if(i==sum)
			{
				System.out.println(i);
			}
			sum=0;
		}
	}
}

