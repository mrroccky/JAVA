/* 
   Write a program to demonstrate what happen if Object is declared in static.
 */
class Student  
{
	Student()
	{
		System.out.println("You are in Constructor of Student");
	}
}
class Library
{
	Library()
	{
		System.out.println("You are in Constructor of Library");
	}
}
class DeclareObjectInStatic
{
	static Student s1;
	public static void main(String args[])
	{
		Library l1=new Library();
		s1=new Student();
	}
}
