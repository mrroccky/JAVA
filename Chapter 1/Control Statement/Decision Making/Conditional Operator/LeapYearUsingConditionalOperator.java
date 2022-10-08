/*Write a program to check enter year is Leap or not using conditional operator.*/
class LeapYearUsingConditionalOperator 
{
	public static void main(String[] args) 
	{
		int year,b;
		year=Integer.parseInt(args[0]);
		b=year%4==0?1:0;
		if(b==1)
		{
			System.out.println("Entered Year is Leap");
		}
		else
		{
		   System.out.println("Entered Year is not Leap");
		}	
    }
}