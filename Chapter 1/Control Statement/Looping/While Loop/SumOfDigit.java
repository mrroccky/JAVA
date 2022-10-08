/*Write program to perform sum of enter Digit*/
class SumOfDigit
{
	public static void main(String[] args) 
	{
		int n,digit,sum=0;
		n=Integer.parseInt(args[0]);
		while(n>0)
		{
		    digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		 System.out.println("Sum of Digit is="+sum); 
	}
}

