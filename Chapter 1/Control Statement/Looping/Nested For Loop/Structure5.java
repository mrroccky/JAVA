/*
Write a program to print following structure.
0
01
012
0123
01234 
012345
*/
class Structure5 
{
	public static void main(String[] args) 
	{
		int i,j;
		for(i=0;i<=5;i++)
		{
			 for(j=0;j<=i;j++)
			 {
				 System.out.print(j);
			 }
			 System.out.print("\n");
		}
	}
}
