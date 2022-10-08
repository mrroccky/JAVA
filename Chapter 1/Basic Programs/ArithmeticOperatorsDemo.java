/* Write a program to demonstrate Arithmetic operators.*/
class ArithmeticOperatorsDemo
{
	public static void main(String[] args) 
	{
			int a,b,c;
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a+b;
			System.out.println("Addition is="+c);
			c=a-b;
			System.out.println("Subtraction is="+c);
			c=a*b;
			System.out.println("Multiplication is="+c);
			c=a/b;
			System.out.println("Division is="+c);
			c=a%b;
			System.out.println("Mod is="+c);
	}
}
