/* Write program to demonstrate Parameterized Constructor.
             OR
  Write a program to define class of Student having Data members are
  name and roll number passing argument through the Parameterized Constructor.
*/

class Student
{
	String name ;
	int roll_no;
	Student(String n,int rn)
	{
		name=n;
		roll_no=rn;
	}
	void display()
	{
		System.out.println("Name of Student is="+name);
		System.out.println("Roll number of Student is="+roll_no);
	}
	public static void main(String args[])
	{
		Student d=new Student("john",1);
		d.display();
	}
}