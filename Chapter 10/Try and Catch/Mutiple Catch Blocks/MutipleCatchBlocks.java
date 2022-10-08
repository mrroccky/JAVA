/* Write a program to demonstrate Mutiple Catch block */ 
class MutipleCatchBlocks
{
	public static void main(String[] args) 
	{
		int a,b,c;
		int a1[];
	    int index;
		try
		{
			
		     a=Integer.parseInt(args[0]);
		     b=Integer.parseInt(args[1]);
		     index=Integer.parseInt(args[2]);
		     c=a/b;
		     a1=new int[index];
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception is due to="+e);
		}
		catch (NegativeArraySizeException  e)
		{
			System.out.println("Exception is due to="+e);
		}
	}
}
