/*
Write a program to print following structure.
1
2 4
3 6 8
4 8 12 16
5 10 15 20 25
*/
class Structure8 
{
	public static void main(String[] args) 
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			 for(j=1;j<=i;j++)
			 {
					 System.out.print(" "+j*i);
			 }
			 System.out.print("\n");
		}
	}
}
