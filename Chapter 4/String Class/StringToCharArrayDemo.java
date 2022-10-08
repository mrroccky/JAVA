/* Write a program to demonstrate toCharArray  method of String.*/
class StringToCharArrayDemo 
{
	public static void main(String args[]) 
	{
		String a;
		a=args[0];
		int i;
		char c[]=a.toCharArray();
		for(i=0;i<a.length();i++)
		{
			System.out.println(c[i]);
		}
	}
}
