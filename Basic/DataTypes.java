package Java.Basic;

//todo All present Datatypes in Java
/*
todo Boolean data type
The Boolean data type is used to store only two possible values:
true and false. This data type is used for simple flags that track true/false conditions.
The Boolean data type specifies one bit of information, but its "size" can't be defined precisely.
Example:
Boolean one = false  
//! ************************
todo byte data type
The byte data type is an example of primitive data type. It isan 8-bit signed two's complement integer.
 Its value-range lies between -128 to 127 (inclusive). 
 Its minimum value is -128 and maximum value is 127. Its default value is 0.
The byte data type is used to save memory in large arrays where the memory savings is most required. 
It saves space because a byte is 4 times smaller than an integer. 
It can also be used in place of "int" data type.
Example:
byte a = 10, byte b = -20  
//! ************************
todo Char Data Type
The char data type is a single 16-bit Unicode character.
Its value-range lies between '\u0000' (or 0) to '\uffff' (or 65,535 inclusive).
The char data type is used to store characters.
Example:
char letterA = 'A'  

Why char uses 2 byte in java and what is \u0000 ?
It is because java uses Unicode system not ASCII code system.
 The \u0000 is the lowest range of Unicode system. 
 To get detail explanation about Unicode visit next page.
//! ************************
todo short data type
The short data type is a 16-bit signed two's complement integer.
Its value-range lies between -32,768 to 32,767 (inclusive). 
Its minimum value is -32,768 and maximum value is 32,767. Its default value is 0.
The short data type can also be used to save memory just like byte data type.
 A short data type is 2 times smaller than an integer.
 Example:
short s = 10000, short r = -5000  
//! ************************
todo Int Data Type
The int data type is a 32-bit signed two's complement integer.
 Its value-range lies between - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) (inclusive). 
 Its minimum value is - 2,147,483,648and maximum value is 2,147,483,647.
  Its default value is 0.
The int data type is generally used as a default data type
 for integral values unless if there is no problem about memory.
Example:
int a = 100000, int b = -200000  
//! ************************

todo Long Data Type
The long data type is a 64-bit two's complement integer.
 Its value-range lies between -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)(inclusive).
  Its minimum value is - 9,223,372,036,854,775,808 and 
  maximum value is 9,223,372,036,854,775,807. 
  Its default value is 0. The long data type is 
  used when you need a range of values more than those provided by int.
  Example:
long a = 100000L, long b = -200000L  
//! ************************
todo Float Data Type
The float data type is a single-precision 32-bit IEEE 754 floating point.
Its value range is unlimited. It is recommended to use a float (instead of double) 
if you need to save memory in large arrays of floating point numbers.
 The float data type should never be used for precise values, such as currency. 
 Its default value is 0.0F.
Example:
float f1 = 234.5f  
//! ************************
todo Double Data Type
The double data type is a double-precision 64-bit IEEE 754 floating point.
 Its value range is unlimited. 
 The double data type is generally used for decimal values just like float.
  The double data type also should never be used for precise values, such as currency.
   Its default value is 0.0d.
Example:
double d1 = 12.3  
//! ************************
*/

/*
!Primitive Data Types
There are eight primitive datatypes supported by Java. 
Primitive datatypes are predefined by the language and named by a keyword. 
Let us now look into the eight primitive data types in detail.

todo  byte
Byte data type is an 8-bit signed two's complement integer
Minimum value is -128 (-2^7)
Maximum value is 127 (inclusive)(2^7 -1)
Default value is 0
Byte data type is used to save space in large arrays, 
mainly in place of integers, since a byte is four times smaller than an integer.
Example: byte a = 100, byte b = -50

todo short
Short data type is a 16-bit signed two's complement integer
Minimum value is -32,768 (-2^15)
Maximum value is 32,767 (inclusive) (2^15 -1)
Short data type can also be used to save memory as byte data type. A short is 2 times smaller than an integer
Default value is 0.
Example: short s = 10000, short r = -20000

todo int
Int data type is a 32-bit signed two's complement integer.
Minimum value is - 2,147,483,648 (-2^31)
Maximum value is 2,147,483,647(inclusive) (2^31 -1)
Integer is generally used as the default data type for integral values unless there is a concern about memory.
The default value is 0
Example: int a = 100000, int b = -200000

todo long
Long data type is a 64-bit signed two's complement integer
Minimum value is -9,223,372,036,854,775,808(-2^63)
Maximum value is 9,223,372,036,854,775,807 (inclusive)(2^63 -1)
This type is used when a wider range than int is needed
Default value is 0L
Example: long a = 100000L, long b = -200000L

todo float
Float data type is a single-precision 32-bit IEEE 754 floating point
Float is mainly used to save memory in large arrays of floating point numbers
Default value is 0.0f
Float data type is never used for precise values such as currency
Example: float f1 = 234.5f

todo double
double data type is a double-precision 64-bit IEEE 754 floating point
This data type is generally used as the default data type for decimal values, generally the default choice
Double data type should never be used for precise values such as currency
Default value is 0.0d
Example: double d1 = 123.4
todo boolean
boolean data type represents one bit of information
There are only two possible values: true and false
This data type is used for simple flags that track true/false conditions
Default value is false
Example: boolean one = true

todo char
char data type is a single 16-bit Unicode character
Minimum value is '\u0000' (or 0)
Maximum value is '\uffff' (or 65,535 inclusive)
Char data type is used to store any character
Example: char letterA = 'A'
 */
/*
 * Java Literal
A literal is a source code representation of a fixed value. 
They are represented directly in the code without any computation.
Literals can be assigned to any primitive type variable. For example −
byte a = 68;
char a = 'A';

byte, int, long, and short can be expressed in decimal(base 10),
 hexadecimal(base 16) or octal(base 8) number systems as well.
Prefix 0 is used to indicate octal, 
and prefix 0x indicates hexadecimal when using these number systems for literals. 
For example −
int decimal = 100;
int octal = 0144;
int hexa =  0x64;
String literals in Java are specified like they are in most other languages 
by enclosing a sequence of characters between a pair of double quotes. 
Examples of string literals are −
Example
"Hello World"
"two\nlines"
"\"This is in quotes\""
String and char types of literals can contain any Unicode characters. For example −

char a = '\u0001';
String a = "\u0001";

Notation	Character represented
\n			Newline (0x0a)
\r			Carriage return (0x0d)
\f			Formfeed (0x0c)
\b			ackspace (0x08)
\s			Space (0x20)
\t			tab
\"			Double quote
\'			Single quote
\\			backslash
\ddd		Octal character (ddd)
\ uxxxx		Hexadecimal UNICODE character (xxxx)
 
*/
//todo data types and their values 
// Data Type	Default Value	Default size
// boolean		false			1 bit
// char			'\u0000'		2 byte
// byte				0			1 byte
// short			0			2 byte
// int				0			4 byte
// long				0L			8 byte
// float			0.0f		4 byte
// double			0.0d		8 byte
//String
public class DataTypes {

	public static void datatypes(){
		boolean isok = false; // it basicay means isok is false
		char name = 'A'; // it alows only single element either number or single charectr we cant pass
							// sritng init
		byte Byte = 127; // only allow 1 to 127//its Primitive Data Types Variables are nothing but
		// reserved memory locations to store values.
		// This means that when you create a variable you reserve some space in the
		// memory.
		short a = 1000;// Short data type can also be used to save memory as byte data type.
		// A short is 2 times smaller than an integer
		int number = 100; // it allows only string
		long nu = 100000; // float sring car not allowed only real numbers are allowed
		// This type is used when a wider range than int is needed
		float f1 = 4000.f; // its not allow decleration intoll we use .f in ending
		double d = 1000000000000000000000000000000.d;// it allow small value without .d not largrt values
		String Name = "John";
		System.out.println(Name);
		System.out.println("boolian  = " + isok);
		System.out.println("char=  " + name);
		System.out.println("byte= " + Byte);
		System.out.println("short = " + a);
		System.out.println("int  = " + number);
		System.out.println("long = " + nu);
		System.out.println("float = " + f1);
		System.out.println("double" + d);

	}
	public static void main(String[] args) {
		datatypes();
	}
}
