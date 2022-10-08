/* Write a program to do formatting with printf method */
class FormattingWithPrintfMethod
{
	public static void main(String args[]) 
	{
		int a=10;
		double b=1012.123456;
		String c="Chetan";
		char d[]={'M','u','k','e','s','h'};

		System.out.printf("%10d",a);
		System.out.printf("\n%03d",a);
		System.out.printf("\n%d",a);
		System.out.printf("\n%.2f",b);
		System.out.printf("\n%10.3s",c);
		System.out.printf("\n%10.3S",c);
		System.out.printf("\n%5c",d[0]);

	}
}
