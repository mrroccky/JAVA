/* 
  Write a program to print following structure.
   
      * * * * *
	   * * * *
	    * * *
	     * *
	      *
*/
class Structure21
{
	public static void main(String[] args) 
	{
		int i,j,k=1,len=1;
		for(i=5;i>=1;i--)
		{
			 for(j=1;j<=i;j++)
			 {
				 for(;k<len;k++)
				 {
					System.out.print(" ");
				 } 
				 System.out.print(" *");
			 }
			 k=1;
			 len++;
			 System.out.print("\n");
		}
	}
}