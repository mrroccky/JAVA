/*Write a program to demonstrate cos method of Math class.*/
class CosMethodDemo 
{
	public static void main(String args[]) 
	{
		 double a;
		 double b;
		 a=Double.parseDouble(args[0]);
		 b=Math.cos(a);
		 System.out.println("Cos value of entered number is="+b);
	}
}
/*
Note:-
      1] This is method of Math class and this class is present in lang package(i.e import java.lang.*)
	     which implcitly import in every program of Java. 
      2] This method is static method so that it is called by class name(i.e Math.cos(arg1)).
	  3] This method must have one argument.
	  4] This method return cos value of given number in radian.
	  5] This method must return double value.
	  6] This method has four forms.
	       a] cos(int) return cos value of Integer data type.
		   b] cos(long) return cos value of Long data type.
		   c] cos(float) return cos value of Float data type.
		   d] cos(double) return cos value of Double data type.
		   e] cos(char) return cos value of Character data type.
		      Note:-
			    1] In above point e if we assign decimal value to the variable there is no need to conversion for finding answer by us.
				   But we assign value to the variable in Unicode(Hexadecimal) value then cos method gives answer in the value of
				   decimal. And we must do conversion for understanding result.
				2] Pointing argument is not working with cos(char) form Because character data type never store pointing
				   value.
	  7] That simply means it works with Integer,Long,Float,Double and Character data types.
*/