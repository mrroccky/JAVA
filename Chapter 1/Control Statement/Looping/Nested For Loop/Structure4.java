/*
Write a program to print following structure.
1
12
123
12345
*/
class Structure4 
{
	public static void main(String[] args) 
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			 for(j=1;j<=i;j++)
			 {
				 System.out.print(j);
			 }
			 System.out.print("\n");
		}
	}
}
