/*
   Write a program to demonstrate isEmpty method of String.
               OR
   Write a program to check that string is empty or not.

   
*/
class StringIsEmpty
{
	public static void main(String args[]) 
	{
		String a="";
		boolean check;
		if(a.isEmpty())
		{
		   System.out.println("String is Empty");
		}
		else
		{
			System.out.println("String is not Empty");
		}
	}
}
/*
   Note:-
         1] This method must return boolean value".
		 2] It return true if String is empty otherwise it return false.
		 3] This method is mostly used when we want to check text field or text box is empty or not.
*/