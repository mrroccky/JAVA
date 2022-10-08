/*
   Write a program to calculate Gross salary where user enter Basic salary .
   Use following data.
   HRA=0.3(3%)
   TA=0.2(2%)
   DA=0.10(1%)
*/
class GrossSalary
{
	public static void main(String args[])
	{
		double basic_salary,Gross_Salary;
		double HRA,TA,DA;
		basic_salary=Double.parseDouble(args[0]);
		HRA=basic_salary*0.3;
		TA=basic_salary*0.2;
		DA=basic_salary*0.10;
		Gross_Salary=basic_salary+HRA+TA+DA;
		System.out.println("Gross Salary is="+Gross_Salary);
	}
}
