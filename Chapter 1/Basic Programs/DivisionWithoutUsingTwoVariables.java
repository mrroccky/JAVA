/*
   Write a program to perform Division of entered two numbers without using 
   variables to store enter two values and store result in third variable.
 */
class DivisionWithoutUsingTwoVariables 
{
	public static void main(String[] args) 
	{
		 int a,b,c;
		 c=Integer.parseInt(args[0])/Integer.parseInt(args[1]);
		 System.out.println("Division is="+c);
	}
}
