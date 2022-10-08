/* Write a program to check enter String is Palindrome or Not.*/
class StringPalindrome
{
	public static void main(String args[]) 
	{
		String a,b="";
		int i,len;
		a=args[0];
		len=a.length();
		for(i=len-1;i>=0;i--)
		{
			b+=a.charAt(i);
		}
		if(a.equals(b))
		{
			System.out.println("Entered string is Palindrome");
		}
		else
		{
			System.out.println("Entered string is not Palindrome");
		}

	}
} 
 