/*Write a program to demonstrate cos method of Math class.*/
class AcosMethodDemo 
{
	public static void main(String args[]) 
	{
		 int a;
		 double b;
		 a=Integer.parseInt(args[0]);
		 b=Math.cos(a);
		 System.out.println("Cosin value of entered number in angle is="+b);
	}
}
/*
Note:-
      1] This is method of Math class and this class is present in lang package(i.e import java.lang.*)
	     which implcitly import in every program of java. 
      2] This method is static method so that it is called by class name(i.e Math.cos(arg1)).
	  3] This method must have one argument.
	  4] This method return cos value of given number in radian.
	  5] This method must return double value.
	  6] This method has four forms.
	       a] cos(int) return cos value of Integer data type.
		   b] cos(long) return cos value of Long data type.
		   c] cos(float) return cos value of Float data type.
		   d] cos(double) return cos of Double data type.
	  7] That simply means it works with Integer,Long,Float,Double data types.
*/