/*
Write a program to define class of Employee having data members are 
emp_id, emp_name, emp_sal read data and display it.*/
import java.io.*;
class Employee
{
		String emp_name;
		int emp_id;
		double emp_sal;
		BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		void get()
		{
			try
			{
				System.out.println("Enter the Employee ID");
				emp_id=Integer.parseInt(b1.readLine());
				System.out.println("Enter the Employee name");
				emp_name=b1.readLine();
				System.out.println("Enter the Employee Salary");
				emp_sal=Double.parseDouble(b1.readLine());
			}
			catch (IOException e)
			{
				System.out.println(e);
			}
		}
		void display()
	    {

			System.out.println("Employee ID="+emp_id);
			System.out.println("Employee Name="+emp_name);
			System.out.println("Employee Salary="+emp_sal);
		}
		public static void main(String args[])
	    {
			Employee e1=new Employee();
			e1.get();
			e1.display();
		}
}