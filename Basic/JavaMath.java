package Java.Basic;

/*
 * Java Math
The Java Math class has many methods that allows you to perform mathematical tasks on numbers.
Math.max(x,y)
The Math.max(x,y) method can be used to find the highest value of x and y:
Example
Math.max(5, 10);
Math.min(x,y)
The Math.min(x,y) method can be used to find the lowest value of x and y:
Example
Math.min(5, 10);
Math.sqrt(x)
The Math.sqrt(x) method returns the square root of x:
Example
Math.sqrt(64);
Math.abs(x)
The Math.abs(x) method returns the absolute (positive) value of x:
Example
Math.abs(-4.7);
Random Numbers
Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
Example
Math.random();
To get more control over the random number, for example,
if you only want a random number between 0 and 100, you can use the following formula:
Example
int randomNum = (int)(Math.random() * 101);  // 0 to 100

 */
public class JavaMath {

	public static void main(String[] args) {
		int a = 10;
		int b = 50;

		// The Math.max(a,b) method can be used to find the highest value of a and b:
		int max=Math.max(a, b);
		// The Math.min(x,y) method can be used to find the lowest value of x and y:
		int min=Math.min(a, b);
		// The Math.abs(x) method returns the absolute (positive) value of x:
		int abs=Math.abs(a);
		// The Math.sqrt(x) method returns the square root of x:

		// Math.random() returns a random number between 0.0 (inclusive), and 1.0
		// (exclusive):
		Math.random();
		int randomNum = (int) (Math.random() * 101);//0to100

		double sqrt=Math.sqrt(a);
		double pow=Math.pow(a, b);
		System.out.println("max"+max);
		System.out.println("min"+min);
		System.out.println("abs"+abs);
		System.out.println("random" +randomNum);
		System.out.println("sqrt"+sqrt);
		System.out.println("pow"+pow);
		System.out.println(a>b);//it return fals or true according to condition 
	}
}
