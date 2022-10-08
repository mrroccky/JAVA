/*Write a program to check enter number is Even or Odd using conditional operator*/
class EvenOddUsingConditionalOperator 
{
	public static void main(String args[]) 
	{
			int a,b;
			a=Integer.parseInt(args[0]);
			b=a%2==0?1:0;
			if(b==1)
			{
				System.out.println("Entered no is Even");
			}
			else
			{
			   System.out.println("Entered no is Odd");
			}	
		}
}

