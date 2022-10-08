/*Write a program to find Greatest and Smallest number in a Array.*/
class GreatestAndSmallestInArray 
{
	public static void main(String args[]) 
	{
		int a[]=new int[50];
		int i,max,min,n;
		for(i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		max=a[0];
		min=a[0];
		for(i=1;i<args.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Grestest number in array="+max);
		System.out.println("Smallest number in array="+min);
	}
}
