/*
  Write a program to define class of Employee having Data members are emp_id, emp_name, emp_sal 
  where user enter Employee ID,name and salary using Parameterized Constructor.
*/
class Employee
{
	int emp_id;
	String emp_name ;
	double emp_sal;
	Employee(int id,String name,double salary)
	{
		emp_id=id;
		emp_name=name;
		emp_sal=salary;
	}
	void display()
	{
		System.out.println("Employee ID="+emp_id);
		System.out.println("Employee Name="+emp_name);
		System.out.println("Employee ID="+emp_sal);

	}
	public static void main(String args[])
	{
		int id;
		String name;
		double sal;
		id=Integer.parseInt(args[0]);
		name=args[1];
		sal=Double.parseDouble(args[0]);
		Employee s1=new Employee(id,name,sal);
		s1.display();
	}
}