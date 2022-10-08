/*Write a program to demonstrate abs method of Math class.*/
class AbsMethodDemo 
{
	public static void main(String[] args) 
	{
		 int a,b;
		 a=Integer.parseInt(args[0]);
		 b=Math.abs(a);
		 System.out.println("Absolute value of entered number is="+b);
	}
}
/*
Note:-
      1] This is method of Math class and this class is present in lang package(i.e import java.lang.*)
	     which implcitly import in every program of Java. 
      2] This method is static method so that it is called by class name(i.e Math.abs(arg1)).
	  3] This method must have one argument.
	  4] This method return absolute value that is positve value.
	  5] This method must return absolute value of data type that it passed as argument expect character data type.
	  6] This method has four forms.
	       a] abs(int) return absolute value of Integer data type.
		   b] abs(long) return absolute value of Long data type.
		   c] abs(float) return absolute value of  Float data type.
		   d] abs(double) return absolute value of Double data type.
		   e] abs(char) return absolute value of Character data type.
	  7] Note:-
			1] There is no sense to use abs method along with character data type as argument. This is because of 
			   role of abs method is give to postive value of negative value. And We donot have Negative Character Unicode.
	  8] Return type of this method must not be Short,Byte Character and Boolean data types.
	  9] That simply means it works with Integer,Long,Float,Double and Character data types.
*/