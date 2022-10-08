/*
Write a program to print following structure.
              *
			*   *
		  *   *   * 
		*   *   *   *  
	   *  *  *   *   * 
	   *  *  *    *  *
		 *  *   *   *
		  *  *  *  *
			 * *
			  *
*/
class Structure19
{
	public static void main(String[] args) 
	{
		int i,j,k=1,len=5;
		for(i=1;i<=5;i++)
		{
			 for(j=1;j<=i;j++)
			 {
				 for(;k<=len;k++)
				 {
					System.out.print(" ");
				 } 
				 System.out.print(" *");
			 }
			 k=1;
			 len--;
			 System.out.print("\n");
		}
		k=5;
		len=5;
		for(i=5;i>=1;i--)
		{
			 for(j=1;j<=i;j++)
			 {
				 for(;k<=len;k++)
				 {
					System.out.print(" ");
				 } 
				 System.out.print(" *");
			 }
			 k=5;
			 len++;
			 System.out.print("\n");
		}
	}
}
