/*Write a program to calculate total marks and percentage of five subjects.*/
class MarksAndPercentageOfFiveSubjects
{
	public static void main(String args[])
	{
		int subject1,subject2,subject3,subject4,subject5;
		int total;
		double percentage;
		subject1=Integer.parseInt(args[0]);
	    subject2=Integer.parseInt(args[1]);
		subject3=Integer.parseInt(args[2]);
		subject4=Integer.parseInt(args[3]);
		subject5=Integer.parseInt(args[4]);
		total=subject1+subject2+subject3+subject4+subject5;
		percentage=(double)total/500*100;
		System.out.println("Total mark of 5 subjects are="+total);
		System.out.println("Percentage is="+percentage);
	}
}