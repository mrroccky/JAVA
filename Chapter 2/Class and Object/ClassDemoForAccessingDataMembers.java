/*
Write a program to access data members of class.
            OR
Write a program to access instance variables of class.
*/
class ClassDemoForAccessingDataMembers
{
	int a=10;
	double b=10.23;
}
class ClassDemoForCallingDataMemberOfClass
{
	  public static void main(String args[])
	  {
		  ClassDemoForAccessingDataMembers c1=new ClassDemoForAccessingDataMembers();
		  System.out.println("Value of instance variable a is="+c1.a);
		   System.out.println("Value of instance variable b is="+c1.b);
	  }
}