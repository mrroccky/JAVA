/* Write a program to demonstrate Exponent along with float data type. */
class ExponentDemoWithFloatDataType 
{
	public static void main(String args[]) 
	{
		float a=0.0314E2F;
		float b=0.0314e2f;
		System.out.println("Exponent value of a variable with float data type and capital E and F suffix="+a);
		System.out.println("Exponent value of b variable with float data type and small e and f suffix="+b);
	}
}
/*
  Note:-
         1] When we define Exponent in Java it consider that exponent value as double literal by default.
		    Let us see Examples:-

			  1. double a=0.0314E2;// Valid statement.
			  2. float a=0.0314E2;// Invalid statement.

			  Explaination:-
			               1. In Example 2 Java compiler took 0.0314E2 value as double.
						      So that this double literal is not store in float data type because float data type
							  requires 4 bytes and double data type require 8 bytes.
		 2] For storing exponent value in float data type we must convert double literal into float literal by doing 
		    following way.
			 
			    1. float a=0.0314E2F; // Valid statement.
				2. float a=0.0314e2f; // Valid statement.
					
				Explaination:-

				            1. Above both examples are valid.
							2. 0.0314E2F and 0.0314e2f are float literal in exponent form.
*/
				