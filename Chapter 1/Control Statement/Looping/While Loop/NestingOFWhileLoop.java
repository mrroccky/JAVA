/*Write a program to demonstrate Nesting of while loop.*/
class NestingOFWhileLoop 
{
	public static void main(String[] args) 
	{
		int i=1,j;
		while(i<=2)
		{
		     System.out.println("Outer While Loop is executed "+i+" Time");
			 j=1;
			 while(j<=2)
			 {
				 System.out.println("Inner While Loop is executed "+j+" Time");
				 j++;
			 }
			 i++;
		}
	}
}
