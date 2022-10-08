/*Write a program to display message  n time but written for loop in different way.*/
class ForLoopInDifferentWay2
{
	public static void main(String[] args) 
	{
		int i,n;
		boolean testVariable;
        n=Integer.parseInt(args[0]);
        i=1;
        testVariable=i<=n;
		for(;testVariable;)
		{
			
			if(i<=n)
			{
				testVariable=true;
				i++;
				System.out.println("Java");
			}
			else
			{
				testVariable=false;
			}
		}
	}
}