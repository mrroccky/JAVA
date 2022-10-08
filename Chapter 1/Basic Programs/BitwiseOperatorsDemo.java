/*Write a program to demonstrate Bitwise operators.*/
class BitwiseOperatorsDemo 
{
	public static void main(String args[]) 
	{
		int a=10,b=5;
	    int r1,r2,r3,r4,r5,r6;
		r1=a&b;
		r2=a|b;
		r3=a^b;
		r4=~a;
		r5=a<<2;
		r6=a>>2;
		System.out.println("Bitwise AND="+r1);
		System.out.println("Bitwise OR="+r2);
		System.out.println("Bitwise Ex-OR="+r3);
		System.out.println("Bitwise  ones complement="+r4);
		System.out.println("Bitwise left shift operator is="+r5);
		System.out.println("Bitwise right shift operator is="+r6);   
     }
}
/*
Note:-
       1] Bitwise operators only work on short,byte,long int,boolean operand.
	   2] Bitwise operators does not work with float or double operand but we can store result of bitwise 
	      operation in float or double data type variable. 
       3] We can not store result of Bitwise operation in short,byte operand. Because short, byte data type promotated
	      into integer data type(That means result of short and byte operand on bitwise converted into integer
		  data type due type promotion. 
	   4] Result of Bitwise operators vary with positive and negative value.
	   6] We perform left and right shift more than 32 (Size of Integer data type in Java) bits for integer 
	      operand than it perform mode operation and perform shifiting operation.
		  Lets understand following example.

		    int a=5,b;
			b=a<<66;
			Here we notice that we shift 5 by 66 bits towards left.But maximum bits require for integer data type is 32.
			Here we shift 5 by 66 bits towards left and 66 is greater than 32.
			Hence first left shift operator find reminder and then perform shifting operation towards left.
			Let us see how it work below.
			
			66%32=2
			Here 66 is number of bits to be want to shifted at left and 32 is number of bits require for integer data type.
			After doing that left shift perform following.

			c=5*2^2;
			Here 2 is mode operator result we was done above.
			After that we will get 20 as result.
			c=20;


			int a=5,b;
			b=a>>66;
			Here we notice that we shift 5 by 66 bit towards right.But maximum bits require for integer data type is 32.
			Here we shift 5 by 66 bits towards right and 66 is greater than 32.
			Hence first right operator find reminder and then perform shifting operation.
			Let us see how it work below.
			
			66%32=2
			Here 66 is number of bits to be want to shifted at left and 32 is number of bits require for integer data type.
			After doing that right shift perform following.

			c=5/2^2;
			Here 2 is mode operator result we was done above.
			After that we will get 1 as result.
			c=1;

           Note:-Above is applicable for integer data type not for short, byte data type.
		   -------------------------------------------------------------------------------

			

	   7] Bitwise operators are 
	      
		  ---------------------------------------------------------------
		  | Sr no |  Oprator       |	Meanging                        |
			____________________________________________________________
		  |  1    |       &&       |  Bitwise AND                       |
			____________________________________________________________
		  |  2    |       |        |  Bitwise OR                        |
			____________________________________________________________
		  |  3    |       ^        |  Bitwise Ex-OR                     |
			____________________________________________________________
		  |  4    |       <<       |  Left shift                        |
			____________________________________________________________
		  |  5    |       >>       |  Right shift                       |
			____________________________________________________________
		  |  6    |      ~         |  One complement                    | 
		  _______________________________________________________________
*/	  
