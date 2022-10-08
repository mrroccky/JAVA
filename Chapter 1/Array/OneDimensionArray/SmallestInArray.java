/*Write a program to find Smallest number in Array.*/
class SmallestInArray 
{
	public static void main(String[] args) 
	{
		int a[]=new int[50];
		int i,min,n;
		for(i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		min=a[0];
		for(i=1;i<args.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Smallest number in array="+min);
	}
}
