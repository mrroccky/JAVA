package Java.Basic;

public class BitwiseOperators {
	/*
	 * 3.5. Bitwise Operator Table
	 * Let's summarize the result of the operators we've seen to so far in a
	 * comparison table:
	 * 
	 * A B A|B A&B A^B ~A
	 * 0 0 0 0 0 1
	 * 1 0 1 0 1 0
	 * 0 1 1 0 1 1
	 * 1 1 1 1 0 0
	 */

	// bitwise or (|) oprator
	public static void ORoprator(int value1, int value2) {
		int result = value1 | value2;
		System.out.println("//bitwise or (|) oprator" + result);

	}

	// Bitwise AND (&) oprator
	public static void BitwiseAndOprator(int value1, int value2) {
		int result = value1 & value2;
		System.out.println("//Bitwise AND (&) oprator" + result);
	}

	// Bitwise XOR (^)
	public static void BitwiseXOR(int value1, int value2) {
		int result = value1 ^ value2;
		System.out.println("	//Bitwise XOR (^)" + result);
	}

	// Bitwise COMPLEMENT (~)
	public static void BitwiseCOMPLEMENT(int value1) {
		int result = ~value1;
		System.out.println("// Bitwise COMPLEMENT (~)" + result);
	}

	// SignedLeftShift [<<]
	// public static void SignedLeftShift() {
	// 	int value = 12;
	// 	int leftShift = value << 2;
	// 	assertEquals(48, leftShift);
	// }

	public static void main(String[] args) {
		ORoprator(11,10);
		BitwiseAndOprator(12,21);
		BitwiseXOR(10,121);
		BitwiseCOMPLEMENT(11);
	}
}
/*
 * 1. Overview
 * Operators are used in the Java language to operate on data and variables.
 * 
 * In this tutorial, we'll explore Bitwise Operators and how they work in Java.
 * 
 * 2. Bitwise Operators
 * Bitwise operators work on binary digits or bits of input values. We can apply
 * these to the integer types – long, int, short, char, and byte.
 * 
 * Before exploring the different bitwise operators let's first understand how
 * they work.
 * 
 * Bitwise operators work on a binary equivalent of decimal numbers and perform
 * operations on them bit by bit as per the given operator:
 * 
 * First, the operands are converted to their binary representation
 * Next, the operator is applied to each binary number and the result is
 * calculated
 * Finally, the result is converted back to its decimal representation
 * Let's understand with an example; let's take two integers:
 * 
 * int value1 = 6;
 * int value2 = 5;
 * Next, let's apply a bitwise OR operator on these numbers:
 * 
 * int result = 6 | 5;
 * To perform this operation, first, the binary representation of these numbers
 * will be calculated:
 * 
 * Binary number of value1 = 0110
 * Binary number of value2 = 0101
 * Then the operation will be applied to each bit. The result returns a new
 * binary number:
 * 
 * 0110
 * 0101
 * -----
 * 0111
 * Finally, the result 0111 will be converted back to decimal which is equal to
 * 7:
 * 
 * result : 7
 * Bitwise operators are further classified as bitwise logical and bitwise shift
 * operators. Let's now go through each type.
 * 
 * 3. Bitwise Logical Operators
 * The bitwise logical operators are AND(&), OR(|), XOR(^), and NOT(~).
 * 
 * 3.1. Bitwise OR (|)
 * The OR operator compares each binary digit of two integers and gives back 1
 * if either of them is 1.
 * 
 * This is similar to the || logical operator used with booleans. When two
 * booleans are compared the result is true if either of them is true.
 * Similarly, the output is 1 when either of them is 1.
 * 
 * We saw an example of this operator in the previous section:
 * 
 * 
 * freestar
 * 
 * @Test
 * public void givenTwoIntegers_whenOrOperator_thenNewDecimalNumber() {
 * int value1 = 6;
 * int value2 = 5;
 * int result = value1 | value2;
 * assertEquals(7, result);
 * }
 * Let's see the binary representation of this operation:
 * 
 * 0110
 * 0101
 * -----
 * 0111
 * Here, we can see that using OR, 0 and 0 will result in 0, while any
 * combination with at least a 1 will result in 1.
 * 
 * 3.2. Bitwise AND (&)
 * The AND operator compares each binary digit of two integers and gives back 1
 * if both are 1, otherwise it returns 0.
 * 
 * This is similar to the && operator with boolean values. When the values of
 * two booleans are true the result of a && operation is true.
 * 
 * Let's use the same example as above, except now using the & operator instead
 * of the | operator:
 * 
 * @Test
 * public void givenTwoIntegers_whenAndOperator_thenNewDecimalNumber() {
 * int value1 = 6;
 * int value2 = 5;
 * int result = value1 & value2;
 * assertEquals(4, result);
 * }
 * Let's also see the binary representation of this operation:
 * 
 * 0110
 * 0101
 * -----
 * 0100
 * 0100 is 4 in decimal, therefore, the result is:
 * 
 * result : 4
 * 3.3. Bitwise XOR (^)
 * The XOR operator compares each binary digit of two integers and gives back 1
 * if both the compared bits are different. This means that if bits of both the
 * integers are 1 or 0 the result will be 0; otherwise, the result will be 1:
 * 
 * @Test
 * public void givenTwoIntegers_whenXorOperator_thenNewDecimalNumber() {
 * int value1 = 6;
 * int value2 = 5;
 * int result = value1 ^ value2;
 * assertEquals(3, result);
 * }
 * And the binary representation:
 * 
 * 0110
 * 0101
 * -----
 * 0011
 * 0011 is 3 in decimal, therefore, the result is:
 * 
 * result : 3
 * 3.4. Bitwise COMPLEMENT (~)
 * Bitwise Not or Complement operator simply means the negation of each bit of
 * the input value. It takes only one integer and it's equivalent to the !
 * operator.
 * 
 * This operator changes each binary digit of the integer, which means all 0
 * become 1 and all 1 become 0. The ! operator works similarly for boolean
 * values: it reverses boolean values from true to false and vice versa.
 * 
 * Now let's understand with an example how to find the complement of a decimal
 * number.
 * 
 * Let's do the complement of value1 = 6:
 * 
 * @Test
 * public void givenOneInteger_whenNotOperator_thenNewDecimalNumber() {
 * int value1 = 6;
 * int result = ~value1;
 * assertEquals(-7, result);
 * }
 * The value in binary is:
 * 
 * value1 = 0000 0110
 * By applying the complement operator, the result will be:
 * 
 * 0000 0110 -> 1111 1001
 * This is the one’s complement of the decimal number 6. And since the first
 * (leftmost) bit is 1 in binary, it means that the sign is negative for the
 * number that is stored.
 * 
 * Now, since the numbers are stored as 2’s complement, first we need to find
 * its 2’s complement and then convert the resultant binary number into a
 * decimal number:
 * 
 * 1111 1001 -> 0000 0110 + 1 -> 0000 0111
 * Finally, 0000 0111 is 7 in decimal. Since the sign bit was 1 as mentioned
 * above, therefore the resulting answer is:
 * 
 * result : -7
 * 3.5. Bitwise Operator Table
 * Let's summarize the result of the operators we've seen to so far in a
 * comparison table:
 * 
 * A B A|B A&B A^B ~A
 * 0 0 0 0 0 1
 * 1 0 1 0 1 0
 * 0 1 1 0 1 1
 * 1 1 1 1 0 0
 * 4. Bitwise Shift Operators
 * Binary shift operators shift all the bits of the input value either to the
 * left or right based on the shift operator.
 * 
 * Let's see the syntax for these operators:
 * 
 * value <operator> <number_of_times>
 * The left side of the expression is the integer that is shifted, and the right
 * side of the expression denotes the number of times that it has to be shifted.
 * 
 * Bitwise shift operators are further classified as bitwise left and bitwise
 * right shift operators.
 * 
 * 4.1. Signed Left Shift [<<]
 * The left shift operator shifts the bits to the left by the number of times
 * specified by the right side of the operand. After the left shift, the empty
 * space in the right is filled with 0.
 * 
 * Another important point to note is that shifting a number by one is
 * equivalent to multiplying it by 2, or, in general, left shifting a number by
 * n positions is equivalent to multiplication by 2^n.
 * 
 * Let's take the value 12 as the input value.
 * 
 * Now, we will move it by 2 places to the left (12 <<2) and see what will be
 * the final result.
 * 
 * The binary equivalent of 12 is 00001100. After shifting to the left by 2
 * places, the result is 00110000, which is equivalent to 48 in decimal:
 * 
 * @Test
 * public void
 * givenOnePositiveInteger_whenLeftShiftOperator_thenNewDecimalNumber() {
 * int value = 12;
 * int leftShift = value << 2;
 * assertEquals(48, leftShift);
 * }
 * This works similarly for a negative value:
 * 
 * @Test
 * public void
 * givenOneNegativeInteger_whenLeftShiftOperator_thenNewDecimalNumber() {
 * int value = -12;
 * int leftShift = value << 2;
 * assertEquals(-48, leftShift);
 * }
 * 4.2. Signed Right Shift [>>]
 * The right shift operator shifts all the bits to the right. The empty space in
 * the left side is filled depending on the input number:
 * 
 * When an input number is negative, where the leftmost bit is 1, then the empty
 * spaces will be filled with 1
 * When an input number is positive, where the leftmost bit is 0, then the empty
 * spaces will be filled with 0
 * Let's continue the example using 12 as input.
 * 
 * Now, we will move it by 2 places to the right(12 >>2) and see what will be
 * the final result.
 * 
 * The input number is positive, so after shifting to the right by 2 places, the
 * result is 0011, which is 3 in decimal:
 * 
 * @Test
 * public void
 * givenOnePositiveInteger_whenSignedRightShiftOperator_thenNewDecimalNumber() {
 * int value = 12;
 * int rightShift = value >> 2;
 * assertEquals(3, rightShift);
 * }
 * Also, for a negative value:
 * 
 * @Test
 * public void
 * givenOneNegativeInteger_whenSignedRightShiftOperator_thenNewDecimalNumber() {
 * int value = -12;
 * int rightShift = value >> 2;
 * assertEquals(-3, rightShift);
 * }
 * 4.3. Unsigned Right Shift [>>>]
 * This operator is very similar to the signed right shift operator. The only
 * difference is that the empty spaces in the left are filled with 0
 * irrespective of whether the number is positive or negative. Therefore, the
 * result will always be a positive integer.
 * 
 * Let's right shift the same value of 12:
 * 
 * @Test
 * public void
 * givenOnePositiveInteger_whenUnsignedRightShiftOperator_thenNewDecimalNumber()
 * {
 * int value = 12;
 * int unsignedRightShift = value >>> 2;
 * assertEquals(3, unsignedRightShift);
 * }
 * And now, the negative value:
 * 
 * @Test
 * public void
 * givenOneNegativeInteger_whenUnsignedRightShiftOperator_thenNewDecimalNumber()
 * {
 * int value = -12;
 * int unsignedRightShift = value >>> 2;
 * assertEquals(1073741821, unsignedRightShift);
 * }
 * 5. Difference Between Bitwise and Logical Operators
 * There are a few differences between the bitwise operators we've discussed
 * here and the more commonly known logical operators.
 * 
 * First, logical operators work on boolean expressions and return boolean
 * values (either true or false), whereas bitwise operators work on binary
 * digits of integer values (long, int, short, char, and byte) and return an
 * integer.
 * 
 * Also, logical operators always evaluate the first boolean expression and,
 * depending on its result and the operator used, may or may not evaluate the
 * second. On the other hand, bitwise operators always evaluate both operands.
 * 
 * Finally, logical operators are used in making decisions based on multiple
 * conditions, while bitwise operators work on bits and perform bit by bit
 * operations.
 * 
 * 6. Use Cases
 * Some potential use cases of bitwise operators are:
 * 
 * Communication stacks where the individual bits in the header attached to the
 * data signify important information
 * In embedded systems to set/clear/toggle just one single bit of a specific
 * register without modifying the remaining bits
 * To encrypt data for safety issues using the XOR operator
 * In data compression by converting data from one representation to another, to
 * reduce the amount of space used
 */