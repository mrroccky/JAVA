/*
  Write a program to define class of Student having Data members are name and roll number 
  where user enter name and roll numbers using Parameterized Constructor
*/  
class Student1
{
	String name ;
	int roll_no;
	Student1(String n,int rn)
	{
		name=n;
		roll_no=rn;
	}
	void display()
	{
		System.out.println("Name of Student is="+name);
		System.out.println("Roll no of Student is="+roll_no);
	}
	public static void main(String args[])
	{
		int r1;
		String name1;
		name1=args[0];
		r1=Integer.parseInt(args[1]);
		Student1 s1=new Student1(name1,r1);
		s1.display();
	}
}