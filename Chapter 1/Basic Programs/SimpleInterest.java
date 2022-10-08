/*Write a program to calculate Simple interest where user enter Principle amount ,Rate of Interest and No of Year.*/
class SimpleInterest
{
	public static void main(String args[])
	{
		double principle_Amount,rate_Of_Interest,Simple_Interest;
		int no_Of_Year;
		principle_Amount=Double.parseDouble(args[0]);
	    rate_Of_Interest=Double.parseDouble(args[1]);
		no_Of_Year=Integer.parseInt(args[2]);
		Simple_Interest=(principle_Amount*rate_Of_Interest*no_Of_Year)/100;
		System.out.println("Simple Interest is="+Simple_Interest);
	}
}