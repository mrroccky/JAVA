/*Write a program to sort elements using inseration sort*/
class InsertionSort
{
	public static void main(String args[])
	{
		int a[]=new int[50];
		int i,j,tem;
		for(i=1;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		for(i=1;i<args.length;i++)
		{
			tem=a[i];
			j=i-1;
		    while((tem<a[j])&&(j>=0))
			{	
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=tem;
		}
		System.out.println("Sorted order is=");
		for(i=1;i<args.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}