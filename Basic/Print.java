package Java.Basic;

import java.util.Scanner;

public class Print {

	// 1) function that print hello world
	static void helloworld() {
		System.out.println("hello world!");
	}
	// public static void main(String[] args) {
	// helloworld();
	// }

	// 2 take input and print to the console
	static void takeinput() {
		//todo Input Types of scanner object
		//! 1) nextBoolean() Reads a boolean value from the user
		//Boolean variables are stored as 16-bit (2-byte) numbers, but they can only be True or False.
		//! 2) nextByte() Reads a byte value from the user
		//byte: The byte data type is an 8-bit signed two's complement integer.
		//  It has a minimum value of -128 and a maximum value of 127 (inclusive). 
		// The byte data type can be useful for saving memory in large arrays,
		//  where the memory savings actually matters.
		//! 3) nextDouble() Reads a double value from the user
		// Doubles have about 15-16 digits worth of precision, that is,
		//  you can represent numbers with a mantissa of length 15-16 digits,
		//   regardless of the exponent. Regardless of the mantissa, you can represent 
		//   numbers ranging from about 10^-324 to about 10^308 .
		//! 4) nextFloat() Reads a float value from the user
		//! 5) nextInt() Reads a int value from the user
		//! 6) nextLine() Reads a String value from the user
		//! 7) nextLine() Reads a String value from the user
		//! 8) nextShort() Reads a short value from the user
		// scanner and printing integer value
		// The Scanner class is used to get user input, and it is found in the java.util
		// package.
		// To use the Scanner class, create an object of the class and use any of
		// the available methods found in the Scanner class documentation.
		// In our example, we will use the nextLine() method, which is used to read
		// Strings:
		// Scanner decleration
		Scanner scanner = new Scanner(System.in);//we can name anything scaner my obj or any name that you think
		System.out.println("enter number:");
		// scanner.nexint is used to only catch integer value we cant catch anouther
		// values like string
		// float with it
		int number = scanner.nextInt();
		System.out.println("your entered number is = " + number);

		// Scanning And printing String
		System.out.println("enter your name");
		// scanner.nextline or scanner.next is used to catch String only we cant catch
		// int and float with this
		String name = scanner.next();
		System.out.println("your name is : " + name);
		//

	}

	public static void main(String[] args) {
		// takeinput();
	}

	// public static void main(String[] args) {
	// System.out.println("hello World");
	// }
}
/*
 * Other common escape sequences that are valid in Java are:

Code		Result	
\n			New Line	
\r			Carriage Return	
\t			Tab	
\b			Backspace	
\f			Form Feed	

*/