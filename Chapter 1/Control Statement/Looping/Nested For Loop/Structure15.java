/*
Write a program to print following structure.
            1
         2     4
       3     6    9
     4     8    12  16   
   5   10   15    20   25          
*/
class Structure15
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
				   System.out.print(" "+j*i);
			   }
			   k=0;
			  len--;
              System.out.print("\n");
		}
	}
}
