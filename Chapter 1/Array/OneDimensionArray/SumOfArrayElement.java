/*Write a program to read element and perform sum of Array Element.*/
class  SumOfArrayElement
{
	public static void main(String args[]) 
	{
		int a[]=new int[50];
		int i,sum=0;
		for(i=0;i<args.length;i++)
		{
		   a[i]=Integer.parseInt(args[i]);
		}
		for(i=0;i<args.length;i++)
		{
           sum=sum+a[i];
		}
		System.out.println("Addition of Array Element is="+sum);
	}
}