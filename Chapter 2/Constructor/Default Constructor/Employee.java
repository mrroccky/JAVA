/*
  Write a program to define class of Employee having data members are emp_id,emp_name and 
  emp_sal initialize Data members using Default Constructor.
 */
 class Employee
{
    int emp_id;
	String emp_name ;
	double emp_sal;
	Employee()
	{
		emp_id=1;
		emp_name="John";
		emp_sal=50000.50;
	}
	void display()
	{
		System.out.println("Employee ID="+emp_id);
		System.out.println("Employee Name="+emp_name);
		System.out.println("Employee Salary="+emp_sal);
	}
	public static void main(String args[])
	{
		Employee d=new Employee();
		d.display();
	}
}