package Java.Basic.Pattern;

import java.util.Scanner;

public class Number {

	/*
	 * 1 1 1 1
	 * 2 2 2 2
	 * 3 3 3 3
	 * 4 4 4 4
	 */
	static void Pattern3(int Number) {
		int row = 1;
		while (row <= Number) {
			int col = 1;
			while (col <= Number) {
				System.out.print(col + " ");
				col++;
			}
			System.out.println();
			row++;

		}
	}

	/*
	 * 111
	 * 222
	 * 333
	 */
	static void Pattern5(int Number) {
		int row = 1;
		while (row <= Number) {
			int col = 1;
			while (col <= Number) {
				System.out.print(row);
				col++;
			}
			System.out.println();
			row++;
		}

	}

	/*
	 * 123
	 * 123
	 * 123
	 */
	static void Pattern6(int Number) {
		int row = 1;
		while (row <= Number) {
			int col = 1;
			while (col <= Number) {
				System.out.print(col);
				col++;
			}
			System.out.println();
			row++;
		}
	}

	/*
	 * 4321
	 * 4321
	 * 4321
	 * 4321
	 */
	static void Pattern7(int Number) {
		int row = 1;
		while (row <= Number) {
			int col = 1;
			int counter = 0;
			while (col <= Number) {
				System.out.print(Number - counter);
				col++;
				counter++;
			}
			System.out.println();
			row++;
		}
	}

	/*
	 * 1 2 3 4
	 * 5 6 7 8
	 * 9 10 11 12
	 * 13 14 15 16
	 */
	static void Pattern8(int Number) {
		int row = 1;
		int counter = 1;
		while (row <= Number) {
			int col = 1;

			while (col <= Number) {
				System.out.print(counter + " ");
				counter++;
				col++;
			}
			System.out.println();
			row++;
		}
		return;
	}

	/*
	 * 987
	 * 654
	 * 321
	 */
	static void Pattern9(int Number) {
		int row = 1;
		int counter = 0;
		while (row <= Number) {
			int col = 1;

			while (col <= Number) {

				System.out.print(Number * Number - counter + " ");
				counter++;
				col++;
			}
			System.out.println();
			row++;
		}
		return;
	}

	/*
	 * 16 15 14 13
	 * 12 11 10 9
	 * 8 7 6 5
	 * 4 3 2 1
	 */
	static void Pattern10(int Number) {
		int row = 1;
		int counter = 0;
		while (row <= Number) {
			int col = 1;

			while (col <= Number) {
				System.out.print(Number * Number - counter + " ");
				col++;
				counter++;
			}
			System.out.println();
			row++;
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number to draw a pattern");
		int Number = scanner.nextInt();
		scanner.close();
		
	}
}
