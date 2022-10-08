/*Write a program to demonstrate log method of Math class.*/
class LogMethodDemo 
{
	public static void main(String args[]) 
	{
		 double a;
		 double b;
		 a=Double.parseDouble(args[0]);
		 b=Math.log(a);
		 System.out.println("Log value of entered number is="+b);
	}
}
/*
Note:-
      1] This is method of Math class and this class is present in lang package(i.e import java.lang.*)
	     which implcitly import in every program of Java. 
      2] This method is static method so that it is called by class name(i.e Math.log(arg1)).
	  3] This method must have one argument.
	  4] This method must return log of natural logarithm(i.e base e) given number.
	  5] This method must return double value.
	  6] This method has four forms.
	       a] log(int) return log to the base e  value of Integer  =data type.
		   b] log(long) return log to base e  value of Long data type.
		   c] log(float) return log to base e value of Float data type.
		   d] log(double) return log to base e value of Double data type.
		   e] log(char) return log to base e value of Character data type.
		      Note:-
			    1] In above point e if we assign decimal value to the variable there is no need to conversion for finding answer by us.
				   But we assign value to the variable in Unicode(Hexadecimal) value then log method gives answer in the value of
				   decimal. And we must do conversion for understanding result.
				2] Pointing argument is not working with log(char) form Because character data type never store pointing
				   value.

	  7] That simply means it works with Integer,Long,Float,Double and Character data types.
	  8] Some special cases for log method is given below.
	       
		   1] If we passed value as 0 or -0 to log method then it gives Infinity as result.
		   2] If we passed value less than 0 to log method then it gives Nan(Not a Number) as result.
		   3] If we passed value as postive infinity then it gives postive infinity as result.
*/