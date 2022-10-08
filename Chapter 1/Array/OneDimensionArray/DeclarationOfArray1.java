/*Write a program to demonstrate Declaration of One dimension Array by using another way .*/
class DeclarationOfArray1 
{
	public static void main(String args[]) 
	{
		int a[];
		a=new int[5];
		int i;
		for(i=0;i<5;i++)
		{
		   a[i]=Integer.parseInt(args[i]);
		}
		System.out.println("Entered array elements are");
		for(i=0;i<5;i++)
		{
           System.out.println(a[i]);
		}
	}
}