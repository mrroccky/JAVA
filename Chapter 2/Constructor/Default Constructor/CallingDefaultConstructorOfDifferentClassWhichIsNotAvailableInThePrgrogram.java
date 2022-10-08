/*
  Write a program to call Default constructor of another class which are not present in a 
  given program.
*/
class CallingDefaultConstructorOfDifferentClassWhichIsNotAvailableInThePrgrogram
{
	String name ;
	int roll_no;
	CallingDefaultConstructorOfDifferentClassWhichIsNotAvailableInThePrgrogram()
	{
		 new Student().display();
		 new Employee().display();
	}
	public static void main(String args[])
	{
		CallingDefaultConstructorOfDifferentClassWhichIsNotAvailableInThePrgrogram d=new CallingDefaultConstructorOfDifferentClassWhichIsNotAvailableInThePrgrogram();
	}
}