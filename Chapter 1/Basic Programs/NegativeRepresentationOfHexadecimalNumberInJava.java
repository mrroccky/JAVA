/*Write a program to demonstrate negative Hexadecimal representation in Java.*/
class NegativeRepresentationOfHexadecimalNumberInJava
{
	public static void main(String args[]) 
	{
		int a=-0X;
		System.out.printf("\nNegtive Hexadecimal representation in Java= %X",a);
	}
}
/*
  Note:-
        1] Here in variable a we store negative Hexadecimal number.
		2] For finding result of negative Hexadecimal number we are doing following procedure.
		     Here
			    int a=-0X53;

			   Step:-1  Take group of four binary for each digit which is given below.
               ------
				        5       3
					   
					    0101    0011
					     |       |
					    \|/     \|/
					  Binary   Binary
					   of       of 
					    5       3

			  Step:-2  Combine obtained binary of digits.
			  -------
			             01010011-----------> Combining binaries of  5 and 3 and it is binary of Hexadecimal number 53.
				
			  Step:-3  Finding 1's complements of combined binary.
              -------

			            0   1  0  1  0  0  1  1
                        |   |  |  |  |  |  |  |  
					    |   |  |  |  |  |  |  |  
					    |   |  |  |  |  |  |  |  
					    1   0  1  0  1  1  0  0 --------> 1's complement of Hexadecimal number 53 in binary.
			
			Step:-4 Finding 2's complements of of Hexadecimal number 53 in binary from 1's complement.
			-------    
				    For finding 2's complement we add 1 into 1's complement.

					   1   0  1  0  1  1  0  0
					                         1
					---------------------------
					   1   0  1  0  1  1  0  1-------------->2's complement.

		  Step:-5 For finding negative of 53 we must make pairs of 4 of above obtained 2's complement.
		  -------


		             1  0  1 0   1  1  0  1
					 ---------   ----------
					    A           D
					  |_______________|---------->(-53)
   */
		          



