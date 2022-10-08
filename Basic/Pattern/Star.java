package Java.Basic.Pattern;

import java.util.Scanner;

public class Star {

	/*
	 *
	 **
	 ***
	 ****
	 */
	//!need to work on this pattern
	static void Pattern1(int Star) {
		
		int row=1;
		while (row<=Star) {
			int col=1;
			while (col<=Star) {
				
			}
		}
	}

	/*
	 ****
	 ****
	 ****
	 */
	static void Pattern2(int Star) {
	
		int row = 0;
		while (row <= Star) {
			int col = 0;
			while (col < Star) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;

		}
	}


	/*
	  ***
	  ***
	  ***
	 */
	static void Pattern3(int Star) {
		
		int row = 1;
		while (row <= Star) {
			int col = 1;
			while (col <= Star) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}

	}

	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter Number to draw a Star Pattern");
		int Star = scanner.nextInt();
		scanner.close();
		
	}
}
