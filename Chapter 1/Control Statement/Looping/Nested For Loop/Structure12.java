/*
Write a program to print following structure.
               *
			 *   *
		   *   *   * 
		 *   *   *   *  
	   *  *  *   *     *    
*/
class Structure12
{
	public static void main(String[] args) 
	{
		int i,j,k=0,len=5;
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
			 k=0;
			 len--;
			 System.out.print("\n");
		}
	}
}
