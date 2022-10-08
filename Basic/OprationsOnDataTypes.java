
package Java.Basic;

public class OprationsOnDataTypes {

	public static void OprationsOnInteger() {

		/*
		 * Shortcut Arithmetic Operators
		 * Operator Use Description
		 * ++ op++ Increments op by 1; evaluates to the value of op before it was
		 * incremented
		 * ++ ++op Increments op by 1; evaluates to the value of op after it was
		 * incremented
		 * -- op-- Decrements op by 1; evaluates to the value of op before it was
		 * decremented
		 * -- --op Decrements op by 1; evaluates to the value of op after it was
		 * decremented
		 * 
		 */
		// a few numbers
		int i = 37;
		int j = 42;
		double x = 27.475;
		double y = 7.22;
		System.out.println("Variable values...");
		System.out.println("    i = " + i);
		System.out.println("    j = " + j);
		System.out.println("    x = " + x);
		System.out.println("    y = " + y);

		// adding numbers
		System.out.println("Adding...");
		System.out.println("    i + j = " + (i + j));
		System.out.println("    x + y = " + (x + y));

		// subtracting numbers
		System.out.println("Subtracting...");
		System.out.println("    i - j = " + (i - j));
		System.out.println("    x - y = " + (x - y));

		// multiplying numbers
		System.out.println("Multiplying...");
		System.out.println("    i * j = " + (i * j));
		System.out.println("    x * y = " + (x * y));

		// dividing numbers
		System.out.println("Dividing...");
		System.out.println("    i / j = " + (i / j));
		System.out.println("    x / y = " + (x / y));

		// computing the remainder resulting from dividing numbers
		System.out.println("Computing the remainder...");
		System.out.println("    i % j = " + (i % j));
		System.out.println("    x % y = " + (x % y));

		// mixing types
		System.out.println("Mixing types...");
		System.out.println("    j + y = " + (j + y));
		System.out.println("    i * x = " + (i * x));
	}

	public static void main(String[] args) {
		OprationsOnInteger();
	}
}