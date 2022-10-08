/*Write a program to perform Arithmetic operations in single System.out.println*/
class ArithmeticOperationInSingleSoP
{
	public static void main(String args[]) 
	{
		 int a,b,c;
		 a=Integer.parseInt(args[0]);
		 b=Integer.parseInt(args[1]);
		 System.out.println("Addition is="+(a+b)
			                 +"\nSubtraction="+(a-b)
			                 +"\nMultiplication="+(a*b)
			                 +"\nDivision is="+(a/b)
			                 +"\nMod is="+(a%b));
	}
}