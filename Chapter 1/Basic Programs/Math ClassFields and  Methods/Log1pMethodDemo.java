/*Write a program to demonstrate log1p method of Math class.*/
class Log1pMethodDemo 
{
	public static void main(String args[]) 
	{
		 double a;
		 double b;
		 a=Double.parseDouble(args[0]);
		 b=Math.log1p(a);
		 System.out.println("Log1p value of entered number is="+b);
	}
}
/*
Note:-
      1] This is method of Math class and this class is present in lang package(i.e import java.lang.*)
	     which implcitly import in every program of Java. 
      2] This method is static method so that it is called by class name(i.e Math.log1p(arg1)).
	  3] This method must have one argument.
	  4] This method must return natural logarithm(base e) of the sum of argument and 1 of given number.
	  5] This method must return double value.
	  6] This method has four forms.
	       a] log1p(int) return natural logarithm(base e) of the sum of argument and 1 value of Integer data type.
		   b] log1p(long) return natural logarithm(base e) of the sum of argument and 1 value of Long data type.
		   c] log1p(float) return natural logarithm(base e) of the sum of argument and 1 value of Float data type.
		   d] log1p(double) return natural logarithm(base e) of the sum of argument and 1 value of Double data type.
		   e] log1p(char) return natural logarithm(base e) of the sum of argument and 1 value of Character data type.
		      Note:-
			    1] In above point e if we assign decimal value to the variable there is no need to convertion for finding answer by us.
				   But we assign value to the variable in Unicode(Hexadecimal) value then log1p method gives answer in the value of
				   decimal. And we must do conversion for understanding result.
				2] Pointing argument is not working with log1p(char) form Because character data type never store pointing
				    value.
	  7] That simply means it works with Integer,Long,Float,Double and Character data types.
	  8] Some special cases for log method is given below.
	       
		   1] If we passed value as 0 or -0  and -1 to log1 method then it gives Infinity as result.
		   2] If we passed value greater than -1 to log1 method then it gives Nan(Not a Number) as result.
		   3] If we passed value as postive infinity then it gives postive infinity as result.
*/