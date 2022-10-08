/*Write a program to print following structure.
2
24
246
2468
246810
*/
class Structure6 
{
	public static void main(String[] args) 
	{
		int i,j;
		for(i=1;i<=10;i++)
		{

             if(i%2==0)
			 {
				 for(j=1;j<=i;j++)
				 {
					 if(j%2==0)
					 {
						 System.out.print(j);
					 }
				 }
				 System.out.print("\n");
			 }	 
		}	 
	}
}
