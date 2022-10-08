/*Write a program to read element till you want to enter.*/
class  ReadElementoFArray
{
	public static void main(String args[]) 
	{
		int a[]=new int[50];
		int i;
		for(i=0;i<args.length;i++)
		{
		   a[i]=Integer.parseInt(args[i]);
		}
		System.out.println("Entered array elements are");
		for(i=0;i<args.length;i++)
		{
           System.out.println(a[i]);
		}
	}
}