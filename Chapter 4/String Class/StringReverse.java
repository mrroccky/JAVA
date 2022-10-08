/* Write a program to reverse of enter String. */
class StringReverse 
{
	public static void main(String args[]) 
	{
		String a;
		int i,len;
		a=args[0];
		len=a.length();
		for(i=len-1;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
		
		 
	}
}
