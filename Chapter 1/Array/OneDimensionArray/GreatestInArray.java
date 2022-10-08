/*Write a program to find gretest number in a Array*/
class GreatestInArray 
{
	public static void main(String args[]) 
	{
		int a[]=new int[50];
		int i,max,n;
		for(i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		max=a[0];
		for(i=1;i<args.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Greatest number in array="+max);
	}
}
