/*
Write a program to print following structure.
            1
         1     3
       1     3    5
     1     3    5   7   
    1   3   5    7    9          
*/
class Structure17
{
	public static void main(String[] args) 
	{
		int i,j,k=0,len=10;
		for(i=1;i<=10;i++)
		{
			  if(i%2!=0)
		 	  {
				   for(j=1;j<=i;j++)
				   {
					 for(;k<len;k++)
					  {
						 System.out.print(" ");
					   }
					   if(j%2!=0)
					   {
					     System.out.print("   "+j);
					   }

				   }
			  }
			   k=0;
			  len--;
			  System.out.print("\n");
              
		}
	}
}
