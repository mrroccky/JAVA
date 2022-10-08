/*Write a program to demonstrate ceil method of Math class.*/
class CeilMethodDemo 
{
	public static void main(String args[]) 
	{
		 double a;
		 double b;
		 a=Double.parseDouble(args[0]);
		 b=Math.ceil(a);
		 System.out.println("Round up value of entered number is="+b);
	}
}
/*
  Note:-
      1] This is method of Math class and this class is present in lang package(i.e import java.lang.*)
	     which implcitly import in every program of Java. 
      2] This method is static method so that it is called by class name(i.e Math.ceil(arg1)).
	  3] This method must have one argument.
	  4] This method must return double value.
	  5] This method add 1 to the argument if digit after pointer greater than 0. 
	  6] The addition done between digit before point and add it by 1.
	  7] Above points 4 and 5 apply for postive fractional number.
	  8] But sitution for negative fraction number is different let us see below point 9.
	  9] If the number is negative then it round up value.
	 10] This method has four forms.
	       a] ceil(int). 
		   b] ceil(long). 
		   c] ceil(float). 
		   d] ceil(double).
		   e] ceil(char).
	 11] Note:-
			1] There is no sense to use ceil method along with character data type as argument. This is because of 
			   character data do not store pointing value and role of ceil method is round up pointing value.
			   But we can not assign pointing value to character data type.
			2] Pointing argument is not working with ceil(char) form Because character data type never store pointing
			   value.
	 12] That simply means it works with Integer,Long,float,Double and Character data types.
	    
*/