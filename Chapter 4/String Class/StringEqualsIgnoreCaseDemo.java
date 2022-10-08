/*
  Write a program to demonstrate equalsIgnoreCase method of string.
            OR
  Write a program to check enter strings are equal or not but ignoring case.  
*/
class StringEqualsIgnoreCaseDemo 
{
	public static void main(String args[]) 
	{
		 String a,b;
		 a=args[0];
		 b=args[1];
		 if(a.equalsIgnoreCase(b))
		 {
			 System.out.println("Both strings are equals");
		 }
		 else
		 {
			System.out.println("Both strings are not equals");
		 }
	}
}
/*
   Note:-
         1] equalsIgnoreCase method check two strings are equal or not.And return boolean value.
		 2] If both string are equal then it return true otherwise it return false.
		 3] This method is case insensetive.
		 4] If any one ask que that compareToIgnoreCase and equalsIgnoreCase method both are used to comapre string then 
		    what is difference between these two methods then what would be your ans.
			The answer of this question is explain below.
			1] equalIgnoreCase method must return boolean value where compareToIgnoreCase method return Integer value.
			2] There are varies different situation to return integer value like 0 ,Postive Value and Negative value in compareToIgnoreCase method.
			   but then no varies situation present in equalsIgnoreCase method.
			3] compareToIgnoreCase method is to complicated than equalsIgnoreCase method.
			4] compareToIgnoreCase method take more time for execution than equalsIgnoreCase method.
*/

