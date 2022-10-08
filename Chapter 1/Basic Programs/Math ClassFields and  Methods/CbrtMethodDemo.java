/*Write a program to demonstrate cbrt method of Math class.*/
class CbrtMethodDemo 
{
	public static void main(String args[]) 
	{
		 double a;
		 double b;
		 a=Double.parseDouble(args[0]);
		 b=Math.cbrt(a);
		 System.out.println("Cube root of entered number is="+b);
	}
}
/*
Note:-
      1] This is method of Math class and this class is present in lang package(i.e import java.lang.*)
	     which implcitly import in every program of Java. 
      2] This method is static method so that it is called by class name(i.e Math.cbrt(arg1)).
	  3] This method must have one argument.
	  4] This method return cube root of given number.
	  5] This method must return double value.
	  6] This method has four forms.
	       a] cbrt(int) return cube root value of Integer data type.
		   b] cbrt(long) return cube root value of Long data type.
		   c] cbrt(float) return cube root value of Float data type.
		   d] cbrt(double) return cube root value of Double data type.
		   e] cbrt(char) return cube root value of Character data types.
		      Note:-
			       In above point e if we assign decimal value to the variable there is no need to conversion.
				   But we assign value to the variable in Unicode(Hexadecimal) value then cbrt method gives answer in the value of
				   decimal. And we must do conversion for understanding result.
	  7] That simply means it works with Integer,Long,Float,Double and Character data types.
*/