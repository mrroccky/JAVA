/*
Write a program to print following structure.
             1
          1     2
       1     2    3
     1    2     3   4   
  1   2     3    4   5             
*/
class Structure17
{
	public static void main(String[] args) 
	{
		int i,j,k=5,len=5;
		for(i=5;i>=1;i--)
		{
			 for(j=1;j<=i;j++)
			 {
				 for(;k<=len;k++)
			     {
				    System.out.print(" ");
			     } 
				 System.out.print(" "+j);
			 }
			 k=5;
			 len++;
			 System.out.print("\n");
		}
	}
}
