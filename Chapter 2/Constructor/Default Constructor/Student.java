/*
  Write a program to demonstrate Default constructor.
             OR
  Write a program to define class of Student having data members are
  name and roll_no initialize Data members by using Default constructor.
*/
  
class Student
{
	String name ;
	int roll_no;
	Student()
	{
		name="John";
		roll_no=1;
	}
	void display()
	{
		System.out.println("Name of Student is="+name);
		System.out.println("Roll number of Student is="+roll_no);
	}
	public static void main(String args[])
	{
		Student d=new Student();
		d.display();
	}
}
/*
Note:-
         1] In Java constructor and class both have same and Constructor must have return type.
		 2] Constructor invoke when instance of class is created not when we create object of class.
		 3] There are two type of constructor present in Java. Which are given below.
		       1]Default Constructor.
			   2]Parameterized constructor.
         4] When we do not provide constructor to the class of Java compiler implicitly(automatically)
	        provide default constructor(i.e it is automatically writen by Java compiler).To prove that 
			please type following command on command prompt.
			Syntax:-
			          javap class_name
			Example:-
                       javap DefaultConstructorDemo

		 5] Remember that we can put return type to the constructor it is Legal in Java but Illegal in C++.
		    We we put return type along with Constructor the Java compiler treated like normal method 
			not constructor let us see.
				 1]     
					 Student()//Treated as Constructor in Java and C++
					 {
						__________;
						__________;
					 }
					 Here Student is name of class.
				  2]
					 int Student() //Treated as Method and ilegal in C++ 
					 {
						__________;
						__________;
					 }
					 Here Student is name of class.
					We can used int,float,char,long,double,short,boolen,byte as return typr
		 6] If any one asked can constructor has return type?then what would be your answer.
		     Say Yes constructor has return type as classs but must not write it.
			 Example:-
			         Student Student()//Compiler take as it but we must write it explicitly.
					 {
						 ____________;
						 ____________;
					 }
		 7] Single class must contain only one default constructor but it must contain numbers of Paramerterzied
		    Constructor in class by using Constructor overloading.
		 8] In the body of Default constructor we call Parameterized constructors of same or different class .
		    We can also call Default constructor from body of same  Default Constructor. We can also call Default or Parameterized constructor
			of different class from the body of Default constructor which is available in that program or outside the program.In case of Default constructor present outside 
		    program then the class file of that class and calling constructor must be present. 
		 
		   
*/