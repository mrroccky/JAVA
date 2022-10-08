/*Write a program to demonstrate floor method of Math class.*/
class FloorMethodDemo 
{
	public static void main(String args[]) 
	{
		 double a;
		 double b;
		 a=Double.parseDouble(args[0]);
		 b=Math.floor(a);
		 System.out.println("Round value of entered number is="+b);
	}
}
/*
Note:-
      1] This is method of Math class and this class is present in lang package(i.e import java.lang.*)
	     which implcitly import in every program of Java. 
      2] This method is static method so that it is called by class name(i.e Math.floor(arg1)).
	  3] This method must have one argument.
	  4] This method must return round value of given number.
	  5] This method must return double value.
	  6] This method has four forms.
	       a] floor(int) return round value of Integer data type.
		   b] floor(long) return round value of Long data type.
		   c] floor(float) return  round  value of Float data type.
		   d] floor(double) return round value of Double data type.
		   e] floor(char) return round value of Character data type.
	  7] That simply means it works with Integer,Long,float,Double and Character data types.
	  8] Note:-
	        1] There is no sense to use floor method along with character data type as argument. This is because of 
			   character data do not store pointing value and role of floor method is round up pointing value.
			   But we can not assign pointing value to character data type.
			2] Pointing argument is not working with floor(char) form Because character data type never store pointing
			   value.
*/