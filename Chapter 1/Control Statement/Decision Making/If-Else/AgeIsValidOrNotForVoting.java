/*
   Write a program to check enter age is valid for voting or not.
               OR 
   We can use this example when we write about if-else.
 */

class AgeIsValidOrNotForVoting
{
	public static void main(String args[]) 
	{
		int age;
		age=Integer.parseInt(args[0]);
		if(age>=18)
		{
		    System.out.println("Entered age is valid for voting");
		}
		else
		{
			System.out.println("Entered age is not valid for voting");
		}
	}
}
