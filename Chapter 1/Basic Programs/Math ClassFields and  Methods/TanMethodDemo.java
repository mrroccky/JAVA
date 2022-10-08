/*Write a program to demonstrate tan method of Math class.*/
class TanMethodDemo 
{
	public static void main(String args[]) 
	{
		 double a;
		 double b;
		 a=Double.parseDouble(args[0]);
		 b=Math.tan(a);
		 System.out.println("Tan value of entered number is="+b);
	}
}
/*
Note:-
      1] This is method of Math class and this class is present in lang package(i.e import java.lang.*)
	     which implcitly import in every program of Java. 
      2] This method is static method so that it is called by class name(i.e Math.tan(arg1)).
	  3] This method must have one argument.
	  4] This method must return tan value of given number in radian.
	  5] This method must return double value.
	  6] This method has four forms.
	       a] tan(int) return tan value of Integer  data type.
		   b] tan(long) return tan value of Long data type.
		   c] tan(float) return tan value of Float data type.
		   d] tan(double) return tan value of Double data type.
		   e] tan(char) return tan value of Character data type.
			  Note:-
			    1] In above point e if we assign decimal value to the variable there is no need to conversion for finding answer by us.
				   But we assign value to the variable in Unicode(Hexadecimal) value then tan method gives answer in the value of
				   decimal. And we must do conversion for understanding result.
				2] Pointing argument is not working with tan(char) form Because character data type never store pointing
				   value.
	  7] That simply means it works with Integer,Long,Float,Double Character data types.
*/