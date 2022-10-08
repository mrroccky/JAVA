/*
Write a program to print following structure.
A
AB
ABC 
ABCD
ABCDE
ABCDEF
*/
class Structure9 
{
	public static void main(String args[]) 
	{
		int i,j;
		String name="ABCDEF";
		for(i=0;i<=5;i++)
		{
			 for(j=0;j<=i;j++)
			 {
				 System.out.print(name.charAt(j));
			 }
			 System.out.print("\n");
		}
	}
}