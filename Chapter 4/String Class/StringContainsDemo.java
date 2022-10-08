/*
  Write a program to demonstrate contains method of string. 
          OR
  Write a program to check whether enter string sub string is present or not in main string. 
*/
class StringContainsDemo 
{
	public static void main(String args[]) 
	{
		 String a,b;
		 boolean check;
		 a=args[0];
		 b=args[1];
		 check=a.contains(b);
		 if(check==true)
		 {
		    System.out.println("Enter sub string is present in main string");
		 }
		 else
		 {
			  System.out.println("Enter sub string is not present in main string");
		 }
	}
}
/*
   Note:-
          1] If matching sub string is found then it return true value otherwise it return false value.
		  2] This method is case sensetive.
*/