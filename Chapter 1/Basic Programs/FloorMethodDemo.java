/*Write a program to demonstrate floor method Math class.*/
class FloorMethodDemo 
{
	public static void main(String args[]) 
	{
		 int a;
		 double b;
		 a=Double.parseDouble(args[0]);
		 b=Math.floor(a);
		 System.out.println("Round value of entered number is="+b);
	}
}
/*
Note:-
      1] This is method of Math class and this class is present in lang package(i.e import java.lang.*)
	     which implcitly import in every program of java. 
      2] This method is static method so that it is called by class name(i.e Math.floor(arg1)).
	  3] This method must have one arguments.
	  4] This method must return round value of given number.
	  5] This method return double value.
	  6] This method has four forms.
	       a] floor(int) return round value of Integer data type number.
		   b] floor(long) return round value of Long data type number.
		   c] floor(float) return  round  value of Float data type  number.
		   d] floor(double) return  value of Double data type number.
	  7] That simply means it work with Integer,Long,float,Double data types.
*/