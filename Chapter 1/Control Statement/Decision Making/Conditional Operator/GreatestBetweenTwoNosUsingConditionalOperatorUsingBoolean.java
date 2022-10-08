/*Write a program to find greatest number between two numbers using conditional operator along with boolean data type.*/
class GreatestBetweenTwoNosUsingConditionalOperatorUsingBoolean
{
	 public static void main(String args[]) 
	 {
			 int a,b;
			 boolean c;
			 a=Integer.parseInt(args[0]);
			 b=Integer.parseInt(args[1]);
			 c=a>b?true:false;
			 if(c==true)
			 {
				 System.out.println("a is greatest No");
			 }
			 else
			 {
				System.out.println("b is greatest No");
			 }
	}
}