package Java.Basic;

import java.util.Scanner;

public class Ifelse {
	// write A progrram to check number posetive or negative
	static void checkNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter Number To Check itis posetive or negative  :-");
		int number = scanner.nextInt();
		scanner.close();

		if (number == 0) {
			System.out.println(number + "  its zero");
		} else if (number > 0) {
			System.out.println(number + " is positive");
		} else {
			System.out.println(number + " is negative");
		}
	}

	public static void ifelse() {
		int time = 22;
		if (time < 10) {
			System.out.println("Good morning.");
		} else if (time < 20) {
			System.out.println("Good day.");
		} else {
			System.out.println("Good evening.");
		}
		// Outputs "Good evening."
	}

	public static void ShortHandIfelse() {
		// variable = (condition) ? expressionTrue : expressionFalse;
		int num = 20;
		var sys = num > 10 ? true : false;
		System.out.println(sys);
	}

	

	// print 1 to n for loop
	static void printOneToNForLoop() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number to print in loop:-");
		int number = scanner.nextInt();
		for (int i = 1; number >= i; i++) {
			System.out.println(i);
		}
	}

	// print from 1 to n using while loop
	static void PrintOneToNWLoop() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to loop:-");
		int Number = scanner.nextInt();
		int i = 1;
		while (Number >= i) {
			System.out.println(i);
			i++;
		}
	}

	// todo firnd Sum Of all the numbers from 1to n

	//! wrong Implimentation 
	static void findSumOfAllEvenNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int number = scanner.nextInt();
		int i=2 ,sum=0;
		while (i<=number) {
			if (i % 2 ==0) {
				sum=sum+1;
			}
			i++;
		}
		System.out.println("sum From 1 to " +number+"== "+sum);
	}

	static void convertFarenheitToCelcious(){
		/*c=5/9(f-32) */
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter F temprature ");
		int farnhiet =scanner.nextInt();
		scanner.close();
		double celcious = (5.0/9)*(farnhiet - 32);
		System.out.println(farnhiet+" farnhiet to Celcious:- "+celcious+" C" );
	}

	//todo check number prime or not
	static void checkNumberPrimeOrNot(){
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter number to check its prime or not ");
		int number = scanner.nextInt();
		int i=2;
		while(i< number){
			if (number % i == 0 ) {
				System.out.println(number+" diviseble by " +i +" not Prime");
				return;
			}
			i++;
		}
		System.out.println(number +" Prime Number");
	}
	public static void main(String[] args) {
		// ifelse();
		// ShortHandIfelse();
		// todo // write A progrram to check number posetive or negative
		// checkNumber();
		// todo print 1 to n for loop
		// printOneToNForLoop();
		//todo print from 1 to n using while loop
		// PrintOneToNWLoop();
		// todo firnd Sum Of all the numbers from 1to n
		//  findSumOfAllEvenNumber();
		//todo convert farnhiet to celcious
		// convertFarenheitToCelcious();
		//todo check number prime or not
		checkNumberPrimeOrNot();
	}
}
