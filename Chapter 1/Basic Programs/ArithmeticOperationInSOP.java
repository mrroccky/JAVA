/*Write a program to perform Arithmetic operations in System.out.println.*/
class ArithmeticOperationInSOP
{
	public static void main(String[] args) 
	{
		 int a,b,c;
		 a=Integer.parseInt(args[0]);
		 b=Integer.parseInt(args[1]);
		 System.out.println("Addition is="+(a+b)); 
		 System.out.println("Subtraction is="+(a-b)); 
		 System.out.println("Multiplication="+(a*b)); 
		 System.out.println("Division is="+(a/b)); 
		 System.out.println("Mod is="+(a%b)); 
	}
}