/*
      Write a program to demonstrate incrementExact method of Math class.
                    OR
      Write a program to increment value by 1 using incremetExact method.
*/

class IncrementExactMethodDemo 
{
	public static void main(String[] args) 
	{
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Math.incrementExact(a);
		System.out.println("Increment value of variable a using incrementExact method is="+b);
	}
}
/*
  Note:-
       1] This is method of Math class and this class is present in lang package(i.e import java.lang.*)
	      which implcitly import in every program of Java. 
	   2] This method is static method so that it is called by class name(i.e Math.incrementExact(arg1)).
	   3] This method must have one argument.
	   4] This method increments original value by 1.
	   5] This method must return either int or long data types depending on which argument data type you pass to it.
	   6] This method has three forms.
	       a] incrementExact(int) return increment original value by 1 of Integer data type.
		   b] incrementExact(long) return increment original value by 1 of Long data type.
		   c] incrementExact(char) return increment original value by 1 of Character data type.

	   7] This method throwing Arithmetic Exception if there is occurs of overflow for integer data type.
	      Let us understand this points.
		  Example:-
		           int a=2147483647;
				    
				   Above example for incrementExact method give Arithmetic Exception Because of 
				   here max value of Integer data type is 2147483647 and in this example
				   incrementExact method add 1 into 2147483647.
				   So that in above example Arithmetic Exception occurs.
	  8] This method throwing Arithmetic Exception if there is occurs of overflow for long data type.
	      Let us understand this points.
		  Example:-
		           long a=9223372036854775807L;
				    
				   Above example for incrementExact method give Arithmetic Exception Because of 
				   here max value of Long data type is 9223372036854775807 and in this example
				   incrementExact method add 1 into 9223372036854775807.
				   So that in above example Arithmetic Exception occurs.
	   9] Arithmetic Exception is generally given with maximum value of Integer and Long data types.
*/