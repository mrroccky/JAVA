/*
Write a program to print following structure.
12345
1234
123
12
1
*/
class Structure11 
{
	public static void main(String args[]) 
	{
		int i,j;
		for(i=5;i>=1;i--)
		{
			 for(j=1;j<=i;j++)
			 {
				 System.out.print(j);
			 }
			 System.out.print("\n");
		}
	}
}
