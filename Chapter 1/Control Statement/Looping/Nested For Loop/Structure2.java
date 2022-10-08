/*
Write a program to print following structure for n time where user enter n.
*
**
***
****
*****

*/
class Structure2 
{
	public static void main(String[] args) 
	{
		int i,j,n;
		n=Integer.parseInt(args[0]);
	    for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
		    {
				System.out.print(" *");
		     }
			 System.out.print("\n");
	   	}
		
	}
}