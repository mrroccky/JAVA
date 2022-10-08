/*Write a program to demonstrate log10 method of Math class.*/
class Log10MethodDemo 
{
	public static void main(String args[]) 
	{
		 double a;
		 double b;
		 a=Double.parseDouble(args[0]);
		 b=Math.log10(a);
		 System.out.println("Log10 value of entered number is="+b);
	}
}
/*
Note:-
      1] This is method of Math class and this class is present in lang package(i.e import java.lang.*)
	     which implcitly import in every program of Java. 
      2] This method is static method so that it is called by class name(i.e Math.log10(arg1)).
	  3] log10 method means that we find logarithm to the base 10.
	  4] This method must have one argument.
	  5] This method must return logarithm to the base 10 value of given number.
	  6] This method must return double value.
	  7] This method has four forms.
	       a] log10(int) return log to the base 10 value of Integer  data type.
		   b] log10(long) return log to the base 10 value of Long data type.
		   c] log10(float) return  log to the base 10  value of Float data type.
		   d] log10(double) return log to the base 10 value of Double data type.
		   e] log10(char) return log to the base 10 value of Character data type.
		      Note:-
			    1] In above point e if we assign decimal value to the variable there is no need to conversion for finding answer by us.
				   But we assign value to the variable in Unicode(Hexadecimal) value then log10 method gives answer in the value of
				   decimal. And we must do conversion for understanding result.
				2] Pointing argument is not working with log10(char) form Because character data type never store pointing
				   value.
	  8] That simply means it works with Integer,Long,Float,Double and Character data types.

	  9] Some special cases for log10 method is given below.
	       
		   1] If we passed value as 0 or -0 to log10 method then it gives Infinity as result.
		   2] If we passed value less than 0 to log10 method then it gives Nan(Not a Number) as result.
		   3] If we passed value as postive infinity then it gives postive infinity as result.
*/