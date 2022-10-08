/*
   Write a program to demonstrate endsWith method of string.
*/
class StringEndsWithDemo 
{
	public static void main(String args[]) 
	{
		 String a,b;
		 boolean check;
		 a=args[0];
		 b=args[1];
		 check=a.endsWith(b);
		 if(check==true)
		 {
		    System.out.println("String is end with specified string");
		 }
		 else
		 {
			  System.out.println("String is not end with specified string");
		 }
	}
}
/*
   Note:-
          1] If matching sub string is found then it return true value otherwise it return false value.
		  2] This method is case sensetive.
*/