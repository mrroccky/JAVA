 /* Write a program to demonstrate Character data type along with Octal and Hexadecimal value.*/
class  CharacterDataTypeDemoWithOctalAndHexadcecimalNumbers  
{
	public static void main(String args[]) 
	{
		char a='A';
		char b='\u0042';
		char c=67;
		char d=0104;
		char e=0x46;
		System.out.println("Character in a variable from Character value is ="+a);
		System.out.println("Character in b variable from Unicode value is="+b);
		System.out.println("Character in c variable from Decimal value is="+c);
		System.out.println("Character in d variable from Octal value is="+d);
		System.out.println("Character in e variable from Octal value is="+e);


	}
}