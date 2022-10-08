/* Write a program to deeply demonstrate printf method */ 
class DisplayAllDatatypeValueUsingPrintfMethod
{
	public static void main(String[] args) 
	{
		byte b=10;
	    short s=20;
		int i=30;
		long l=40;
		float f=50.0f;
		double d=60.0;
		char c='a';
		boolean bool=true;
		System.out.printf("Byte value is=%d",b);
		System.out.printf("\nShort value is=%d",s);
		System.out.printf("\nInt value is=%d",i);
		System.out.printf("\nLong value is=%d",l);
	/*-----------Octal representation of byte,short,integer,long data type----------*/

		System.out.printf("\n\n\nByte value is in Octal representation is=%o",b);
		System.out.printf("\nShort value is in Octal representation is=%o",s);
		System.out.printf("\nInteger value is in Octal representation is=%o",i);
		System.out.printf("\nLong value is in Octal representation is=%o",l);
    /*---------------------End of Octal representation-------------------------------*/ 

	/*-----------Octal representation of byte,short,integer,long data type in Java----------*/

		System.out.printf("\n\n\nByte value is in Octal representation in Java is=%#o",b);
		System.out.printf("\nShort value is in Octal representation in Java is=%#o",s);
		System.out.printf("\nInteger value is in Octal representation in Java is=%#o",i);
		System.out.printf("\nLong value is in Octal representation in Java is=%#o",l);
    /*---------------------End of Octal representation in Java-------------------------------*/ 
        
	/*-----------Hexadecimal representation of byte,short,integer,long data type in small Hexadecimal letter----------*/

	    System.out.printf("\n\n\nByte value is in Hexadecimal representation in small Hexadecimal letter is=%x",b);
		System.out.printf("\nShort value is in Hexadecimal representation is in small Hexadecimal letter is=%x",s);
		System.out.printf("\nInteger value is in Hexadecimal representation is in small Hexadecimal letter is=%x",i);
		System.out.printf("\nLong value is in Hexadecimal representation is in small Hexadecimal letter is=%x",l);
	/*-----------End Hexadecimal representation of byte,short,integer,long data type in small letter----------*/

	/*-----------Hexadecimal representation of byte,short,integer,long data type in Capital Hexadecimal letter----------*/

	    System.out.printf("\n\n\nByte value is in Hexadecimal representation in capital Hexadecimal letter is=%X",b);
		System.out.printf("\nShort value is in Hexadecimal representation is in capital Hexadecimal letter is=%X",s);
		System.out.printf("\nInteger value is in Hexadecimal representation is in capital Hexadecimal letter is=%X",i);
		System.out.printf("\nLong value is in Hexadecimal representation is in capital Hexadecimal letter is=%X",l);
	/*-----------End Hexadecimal representation of byte,short,integer,long data type in Capital Hexadecimal letter----------*/

	/*-----------Hexadecimal representation of byte,short,integer,long data type in Small Hexadecimal letter in Java----------*/

	    System.out.printf("\n\n\nByte value is in Hexadecimal representation in Java in small Hexadecimal letter is=%#x",b);
		System.out.printf("\nShort value is in Hexadecimal representation is in Java in small Hexadecimal letter is=%#x",s);
		System.out.printf("\nInteger value is in Hexadecimal representation is in Java in small Hexadecimal letter is=%#x",i);
		System.out.printf("\nLong value is in Hexadecimal representation is in Java in small Hexadecimal letter is=%#x",l);
	/*-----------End Hexadecimal representation of byte,short,integer,long data type in in small letter in Java----------*/

	/*-----------Hexadecimal representation of byte,short,integer,long data type in Capital letter hexadecimal in Java----------*/

	    System.out.printf("\n\n\nByte value is in Hexadecimal representation in Java in capital Hexadecimal letter is=%#X",b);
		System.out.printf("\nShort value is in Hexadecimal representation is in Java in capital Hexadecimal letter is=%#X",s);
		System.out.printf("\nInteger value is in Hexadecimal representation is in Java in capitalal Hexadecimal letter is=%#X",i);
		System.out.printf("\nLong value is in Hexadecimal representation is in Java in capital Hexadecimal letter is=%#X",l);
	/*-----------End Hexadecimal representation of byte,short,integer,long data type in in Capital Hexadecimal letter in Java----------*/




		System.out.printf("\n\n\nFloat value in normal form is=%f",f);
		System.out.printf("\nDouble value in normal form is=%f",d);
   /*-----------float and double data type in Exponent form----------*/

		System.out.printf("\n\n\nFloat value in exponent form is=%e",f);
		System.out.printf("\nDouble value in exponent form is=%e",d);

   /*------------End of Exponent form-------------------------------*/

        System.out.printf("\n\n\nCharacter value is in small is =%c",c);
		System.out.printf("\nCharacter value is in Capital is =%C",c);

		System.out.printf("\n\n\nBoolean value is in small is =%b",bool);
		System.out.printf("\nBoolean value is in Capital is =%B",bool);
		
    }
}
/*
  Note:-
         1] printf method was introduced in JDK5.
		 2] For Integer family(Interger,Long,Short,Byte) %d is used.
         3] Range of holding by %d is same as range of long data type.
		 4] We can not use %D with integer family.
		 5] We can also represent integer family value in Octal and Hexadecimal form by using %o and %x.
		 6] For representating interger family number in octal form we use %o.
		 7] For representating interger family number in octal form in Java we use %#o.
		 8] For representating interger family number in Hexadecimal form we use %x.
		 9] For representating interger family number in Hexadecimal form in capital form we use %x.
		10] For representating interger family number in Hexadecimal form in Java we use %#x.
		11] For representating interger family number in Hexadecimal form in small Hexadecimal letter we use %x.
		12] For representating interger family number in Hexadecimal form in Capital Hexadecimal letter we use %X.
		13] We can not use %x or %X and %o or %O with float and double data type.
		14] Table for understanding above description.
		    
			--------------------------------------------------------------------------------- 
		   |Sr.no| Data type   | Representation of Number| Small/Capital  | Format specifier |
		   ---------------------------------------------------------------------------------- 
		   | 1	 |  byte	   |   Decimal               |   -			  |   %d             |
		   ----------------------------------------------------------------------------------- 
		   | 2	 |  short      |   Decimal				 |	 -			  |   %d             |
		   ----------------------------------------------------------------------------------- 
		   | 3	 |  int        |   Decimal               |	 -			  |   %d             |
		   ----------------------------------------------------------------------------------- 
		   | 4	 |  long       |   Decimal               |	 -			  |   %d             |
		   ----------------------------------------------------------------------------------- 
		   | 5	 |  byte	   |   Octal                 |	 -			  |   %o             |
		   ----------------------------------------------------------------------------------- 
		   | 6	 |  short      |   Octal 				 |	 -			  |   %o             |
		   ----------------------------------------------------------------------------------- 
		   | 7	 |  int        |   Octal                 |	 -			  |   %o             |
		   ----------------------------------------------------------------------------------- 
		   | 8	 |  long       |   Octal                 |	 -			  |   %o             |
		   ----------------------------------------------------------------------------------- 
		   | 9	 |  byte	   |   Hexadecimal           |	small		  |   %x             |
		   ----------------------------------------------------------------------------------- 
		   | 10	 |  short      |   Hexadecimal 			 |	small		  |   %x             |
		   -----------------------------------------------------------------------------------
		   | 11	 |  int        |   Hexadecimal           |	small		  |   %x             |
		   -----------------------------------------------------------------------------------
		   | 12	 |  long       |   Hexadecimal           |	small		  |   %x             |
		   -----------------------------------------------------------------------------------
		   | 13	 |  byte	   |   Hexadecimal           |	capital		  |   %X             |
		   -----------------------------------------------------------------------------------
		   | 14	 |  short      |   Hexadecimal 			 |	capital		  |   %X             |
		   -----------------------------------------------------------------------------------
		   | 15	 |  int        |   Hexadecimal           |	capital		  |   %X             |
		   ----------------------------------------------------------------------------------
		   | 16	 |  long       |   Hexadecimal           |	capital		  |   %X             |
		   -----------------------------------------------------------------------------------
		    Tip:- Here in above table Octal and Hexadecimal in Java is not specified. Pelease read respective points at above.
        
		15] For boolean data type value we use %b to display boolean literal in small letter and %B to display boolean literal in capital letter.
		16] For Displaying Character value we use %c for displaying character in small letter.
		17] For Displaying Character value we use %C for displaying character in capital letter.   
		    
*/