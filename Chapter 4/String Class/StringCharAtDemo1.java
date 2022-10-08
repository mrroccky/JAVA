/*Write a program to demonstrate charAt method of String.*/
class StringCharAtDemo1 
{
	public static void main(String[] args) 
	{
		String a;
		int i,len;
		a=args[0];
		len=a.length();
		for(i=0;i<len;i++)
		{
			System.out.println(a.charAt(i));
		}		 
	}
}
