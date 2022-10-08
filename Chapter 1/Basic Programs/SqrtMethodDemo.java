/*Write a program to demonstrate squrt method of Math class*/
class SqrtMethodDemo 
{
	public static void main(String args[]) 
	{
		 int a;
		 double b;
		 a=Integer.parseInt(args[0]);
		 b=Math.sqrt(a);
		 System.out.println("squareroot of entered number is="+b);
	}
}
/*
Note:-
      1] This is method of Math class and this class is present in lang package(i.e import java.lang.*)
	     which implcitly import in every program of java. 
      2] This method is static method so that it is called by class name(i.e Math.sqrt(arg1)).
	  3] This method must have one argument.
	  4] This method return square root of given number.
	  5] This method must return double value.
	  6] This method has four forms.
	       a] sqrt(int) return square root value of Integer  data type.
		   b] sqrt(long) return square root value of Long data type.
		   c] sqrt(float) return square root value of float data type.
		   d] sqrt(double) return square root value of double data type.
	  7] That simply means it work with Integer,Long,Float,Double data type.
*/