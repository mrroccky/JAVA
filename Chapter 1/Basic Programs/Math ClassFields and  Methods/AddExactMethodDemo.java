/*
      Write a program to demonstrate decrementExact method of Math class.
                         OR
       Write a program to decrement value by 1 using decremetExact method.
*/

class AddExactMethodDemo 
{
	public static void main(String[] args) 
	{
		char a=21,b=1;
		double c;
		//a=Integer.parseInt(args[0]);
		//b=Integer.parseInt(args[0]);
		c=Math.addExact(a,b);
		System.out.println("Addition of two numbers using addExact method is="+c);
	}
}
/*
  Note:-
       1] This is method of Math class and this class is present in lang package(i.e import java.lang.*)
	      which implcitly import in every program of Java. 
	   2] This method is static method so that it is called by class name(i.e Math.addExact(arg1,arg2)).
	   3] This method must have two arguments.
	   4] This method is use to perform addition of two numbers.
	   5] This method must return either int or long data types depending on which argument data type you pass to it.
       6] This method has three forms.
	       a] addExact(int) return increment original value by 1 of Integer data type.
		   b] addExact(long) return increment original value by 1 of Long data type.
		   c] incrementExact(char) return increment original value by 1 of Character data type.
*/