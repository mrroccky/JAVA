/*Write a program to enter year is leap or not. */
class LeapYearOrNot
{
	public static void main(String[] args) 
	{
		int year;
		year=Integer.parseInt(args[0]);
		if(year%4==0)
		{
		     System.out.println("Entered year is leap");
		}
		else
		{
			System.out.println("Entered year is not leap");
		}

	}
}  