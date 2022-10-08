/*
Write a program to print following structure.
           0
         0    1
       0   1    2
     0  1   2    3
    0   1    2   3  4
    0   1    2    3  4  5
*/
class Structure13
{
	public static void main(String[] args) 
	{
		int i,j,k=0,len=5;
		for(i=0;i<=5;i++)
		{
			 for(j=0;j<=i;j++)
			 {
				 for(;k<=len;k++)
				 {
					System.out.print(" ");
				 } 
				 System.out.print(" "+j);
			 }
			 k=0;
			 len--;
			 System.out.print("\n");
		}
	}
}
