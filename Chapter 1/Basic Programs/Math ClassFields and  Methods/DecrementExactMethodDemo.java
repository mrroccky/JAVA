/*
      Write a program to demonstrate decrementExact method of Math class.
                         OR
       Write a program to decrement value by 1 using decremetExact method.
*/

class DecrementExactMethodDemo 
{
	public static void main(String[] args) 
	{
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Math.decrementExact(a);
		System.out.println("Decrement value of variable a using decrementExact method is="+b);
	}
}
/*
  Note:-
       1] This is method of Math class and this class is present in lang package(i.e import java.lang.*)
	      which implcitly import in every program of Java. 
	   2] This method is static method so that it is called by class name(i.e Math.decrementExact(arg1)).
	   3] This method must have one argument.
	   4] This method decrements original value by 1.
	   5] This method must return either int or long data types depending on which argument data type you pass to it.
	   6] This method has three forms.
	       a] decrementExact(int) return decrement original value by 1 of Integer data type.
		   b] decrementExact(long) return decrement original value by 1 of Long data type.
		   c] decrementExact(char) return decrement original value by 1 of Character data type.

	   7] This method throwing Arithmetic Exception if there is occurs of overflow for integer data type.
	      Let us understand this points.
		  Example:-
		           int a=-2147483648;
				    
				   Above example for decrementExact method give Arithmetic Exception Because of 
				   here min value of Integer data type is -2147483648 and in this example
				   decrementExact method subtract 1 into -2147483648.
				   So that in above example Arithmetic Exception occurs.
	  8] This method throwing Arithmetic Exception if there is occurs of overflow for long data type.
	      Let us understand this points.
		  Example:-
		           long a=-9223372036854775808L;
				    
				   Above example for decrementExact method give Arithmetic Exception Because of 
				   here min value of Long data type is -9223372036854775808 and in this example
				   decrementExact method subtract 1 into -9223372036854775808.
				   So that in above example Arithmetic Exception occurs.
	  9] Arithmetic Exception is generally given with minimum value of Integer and Long data types.
*/