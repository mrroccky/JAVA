/*Write a program to demonstrate throw keyword*/
class ThrowKeywordDemo1
{
	public static void main(String args[]) 
	{
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		if(b>0)
		{
			throw new ArithmeticException("Can not divid by Zero");
		}
		else
		{
			c=a+b;
			System.out.println("Addition is="+c);
		}
	}
}
