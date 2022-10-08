/*Write a program to check enter age is valid for voting or not by using Boolean data type.*/
class AgeIsValidOrNotForVotingUsingBooleanDataType
{
	public static void main(String[] args) 
	{
		int age;
		boolean check;
		age=Integer.parseInt(args[0]);
		check=age>=18;
		if(check)
		{
		    System.out.println("Entered age is valid for voting");
		}
		else
		{
			System.out.println("Entered age is not valid for voting");
		}
	}
}