/*Write a program to calculate Gross salary Use following data if Basic salary is greater than 5000.
HRA=0.3%
TA=0.2%
DA=0.10%

Otherwise use following data
HRA=0.10%
TA=0.20%
DA=0.1%*/
class GrossSalary
{
	public static void main(String args[])
	{
		double basic_salary,Gross_Salary;
		double HRA,TA,DA;
		basic_salary=Double.parseDouble(args[0]);
		if(basic_salary>5000)
		{
			HRA=basic_salary*0.3;
			TA=basic_salary*0.2;
			DA=basic_salary*0.10;
			Gross_Salary=basic_salary+HRA+TA+DA;
			System.out.println("Gross Salary is="+Gross_Salary);
		}
		else
		{
			HRA=basic_salary*0.10;
			TA=basic_salary*0.20;
			DA=basic_salary*0.1;
			Gross_Salary=basic_salary+HRA+TA+DA;
			System.out.println("Gross Salary is="+Gross_Salary);
		}
	}
}

