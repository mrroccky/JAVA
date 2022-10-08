/*Write a program to demonstrate charAt method of StringBuilder Class.*/
class StringBuilderCharAtDemo
{
	public static void main(String args[]) 
	{
		String a;
		int i,len;
		a=args[0];
		StringBuilder sbd=new StringBuilder(a);
		len=sbd.length();
		for(i=0;i<len;i++)
		{
			System.out.println(a.charAt(i));
		}		 
	}
}
