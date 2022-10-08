/*Write a program to sort elements using Bubble sort*/
class BubbleSort
{
	public static void main(String args[])
	{
		int a[]=new int[50];
		int i,j,tem;
		for(i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		for(i=0;i<args.length;i++)
		{
		   for(j=0;j<args.length-1;j++)
			{
			   if(a[j]>a[j+1])
			   {
                   tem=a[j];
				   a[j]=a[j+1];
				   a[j+1]=tem;
			   }
			}
		}
		System.out.println("Sorted order is=");
		for(i=0;i<args.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}