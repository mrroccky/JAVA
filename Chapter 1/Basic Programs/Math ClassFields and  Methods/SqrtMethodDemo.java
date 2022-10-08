/*Write a program to demonstrate sqrt method of Math class*/
class SqrtMethodDemo 
{
	public static void main(String args[]) 
	{
		 double a;
		 double b;
		 a=Double.parseDouble(args[0]);
		 b=Math.sqrt(a);
		 System.out.println("Square root of entered number is="+b);
	}
}
/*
Note:-
      1] This is method of Math class and this class is present in lang package(i.e import java.lang.*)
	     which implicitly import in every program of Java. 
      2] This method is static method so that it is called by class name(i.e Math.sqrt(arg1)).
	  3] This method must have one argument.
	  4] This method return square root of given number.
	  5] This method must return double value.
	  6] This method has four forms.
	       a] sqrt(int) return square root value of Integer data type.
		   b] sqrt(long) return square root value of Long data type.
		   c] sqrt(float) return square root value of Float data type.
		   d] sqrt(double) return square root value of Double data type.
		   e] sqrt(char) return square root value of Character data type.
		      Note:-
			    1] In above point e if we assign decimal value to the variable there is no need to conversion for finding answer by us.
				   But we assign value to the variable in Unicode(Hexadecimal) value then sqrt method gives answer in the value of
				   decimal. And we must do conversion for understanding result.
				2] Pointing argument is not working with sqrt(char) form Because character data type never store pointing
				   value.

	  7] That simply means it works with Integer,Long,Float,Double and Character data types.
*/