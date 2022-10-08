/*
  Write a program to demonstrate equals method of string.
            OR
  Write a program to check enter strings are equal or not.  
*/
class StringEqualsDemo 
{
	public static void main(String args[]) 
	{
		 String a,b;
		 a=args[0];
		 b=args[1];
		 if(a.equals(b))
		 {
			 System.out.println("Both strings are equal");
		 }
		 else
		 {
			System.out.println("Both string are not equal");
		 }
	}
}
/*
   Note:-
         1] equals method check two strings are equal or not.And return boolean value.
		 2] If both string are equal then it return true otherwise it return false.
		 3] This method is case sensetive.
		 4] If any one ask que that compareTo and equals method both are used to comapre string then 
		    what is difference between these two methods then what would be your ans.
			The answer of this question is explain below.
			1] equal method must return boolean value where compareTo method return Integer value.
			2] There are varies different situation to return integer value like 0 ,Postive Value and Negative value in comapreTo method.
			   but then no varies situation present in equals method.
			3] compareTo method is to complicated than equals method.
			4] compareTo method take more time for execution than equals method.
*/
