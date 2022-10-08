 /*Write a program to demonstrate Character data type.*/
class CharacterDataTypeDemo  
{
	public static void main(String[] args) 
	{
		char a='A';
		char b='\u0042';
		char c=67;
		System.out.println("Character in a="+a);
		System.out.println("Character in b="+b);
		System.out.println("Character in c="+c);
	}
}
/*
Note:-
       1] Character data type requires two bytes because it uses Unicode system by default.
	   2] Java supports 18 international languages throght Unicode.For storing 18 international languages characters 1 byte is not
	      sufficient to store those characters so that Java use 2 Bytes for Character data type. 
	   3] So that it never mean that we does not use ASCII formate with character data type in directly. 
	   4] we can also use ASCII with character data type.
       4] In above program char a='A' contains 'A' character that mean it contains Unicode value of character 'A'
	   5] In above program char a=67 is stored in c variable  that mean we can assign ASCII value to character data type and it converted into Hexadecimal that is Unicode value.
*/   
	   

