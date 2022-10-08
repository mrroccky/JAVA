/*
  Write a program to demonstrate compareToIgnoreCase method of String.
                OR
  Write a program to compare two strings but ignoring case.
*/
class StringCompareToIgnoreCaseDemo 
{
	public static void main(String args[]) 
	{
		 String a,b;
		 int check;
		 a=args[0];
		 b=args[1];
         check=a.compareToIgnoreCase(b);
		 if(check==0)
		 {
			 System.out.println("Both strings are equals");
		 }
		 else if(check>0)
		 {
			System.out.println("String 1 is greater than Strig 2 ");
		 }
		 else
		 {
			 System.out.println("String 1 is less than Strig2");
		 }
   }
}
/*--------------------------------------------------------------------------------------------------------------
You must write output when it say explian output 
   Explaination:-
            1] If
			       String==string2
                   if both strings are  equal then it return Integer 0 value.
			2] If
			       String1>String2
				   if string first is greater than second string then it return Integer Positive value.
			3]If
			       String1<String2
				   if string first is less than second string then it return Integer Negative value.

   Note:-compareTo method is case insensetive.
----------------------------------------------------------------------------------------------------------------*/
