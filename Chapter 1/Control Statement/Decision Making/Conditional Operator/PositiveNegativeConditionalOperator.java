/*Write a program to check enter number is Positive or Negative using conditional operator.*/
 class PositiveNegativeConditionalOperator 
{
	public static void main(String args[]) 
	{
		int a,b;
		a=Integer.parseInt(args[0]);
		b=a>0?1:0;
		if(b==1)
		{
			System.out.println("Entered no is Positive");
		}
		else
		{
		   System.out.println("Entered no is Negative");
		}	
    }
}