/*Write a program to print Reverse of enter digit.*/  
class ReverseOfDigit
{
	public static void main(String[] args) 
	{
		int n,reverseDigit;
		n=Integer.parseInt(args[0]);
		while(n>0)
		{
		    reverseDigit=n%10;
			System.out.print(reverseDigit);
			n=n/10;
		}
		 
	}
}

