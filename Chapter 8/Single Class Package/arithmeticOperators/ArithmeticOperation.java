package arithmeticOperators;
public class ArithmeticOperation
{
       public void add(int a,int b)
	   {
		    int c;
			c=a+b;
			System.out.println("Addition is="+c);
	   }
	   public void sub(int a,int b)
	   {
		   int c;
		   c=a-b;
		   System.out.println("Subtraction is="+c);
	   }
	   public void mul(int a,int b)
	   {
		    int c;
            c=a*b;
			System.out.println("Multiplication is="+c);
	   }
	   public void div(int a,int b)
	   {
		   int c;
		   c=a/b;
		   System.out.println("Division is="+c);
	   }
	   public void mod(int a,int b)
	   {
		   int c;
		   c=a%b;
		   System.out.println("Mod is="+c);
	   }
}