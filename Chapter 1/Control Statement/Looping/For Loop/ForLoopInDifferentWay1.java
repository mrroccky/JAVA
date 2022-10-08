/*Write a program to display message  n time but written for loop in different way.*/
class ForLoopInDifferentWay1
{
	public static void main(String[] args) 
	{
		int i,n;
        n=Integer.parseInt(args[0]);
        i=1;
		for(;i<=n;)
		{
			System.out.println("Java");
			i++;
		}
	}
}