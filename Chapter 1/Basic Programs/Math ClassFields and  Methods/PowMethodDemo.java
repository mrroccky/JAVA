/*Write a program to demonstrate pow method of Math class.*/
class PowMethodDemo 
{
	public static void main(String[] args) 
	{
		double a,b;
		double c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=pow(a,b);
		System.out.println("Power of a is="+c);
	}
}
/*
Note:-
      1] This is method of Math class and this class is present in lang package(i.e import java.lang.*)
	     which implcitly import in every program of Java. 
      2] This method is static method so that it is called by class name(i.e Math.pow(arg1,arg2)).
	  3] This method must have two arguments.
	  4] This method must return power of given number.
	  5] This method return double value.
	  6] This method has four forms.
	       a] pow(int) return power value of Integer data type number.
		   b] pow(long) return power value of Long data type number.
		   c] pow(float) return power value of Float data type  number.
		   d] pow(double) return value of Double data type number.
	  7] The argments of power method have any types expect boolean contains in arg1 and arg2 and we can exchange its order.
	  8] We need not follow the pow method syntax provides by Oracle(Java is under Oracle from 27 Jan 2010).
*/