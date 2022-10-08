/*Write program to find enter number is Palindrome or not. */
class PalindromeNumber
{
	public static void main(String[] args) 
	{
		int n,d,org,sum=0;
		n=Integer.parseInt(args[0]);
		org=n;
		while(n>0)
		{
		    d=n%10;
			sum=sum*10+d;
			n=n/10;
		}
		if(org==sum)
		{
			System.out.println("Entered no is Palindrome");
		}
		else
		{
		  System.out.println("Entered no is not Palindrome");
		}
	}
}

