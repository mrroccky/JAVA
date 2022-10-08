/*
  Write a program to implement following inheritance.
       _____________
      |Customer     |
	  |_____________|
      |Name         | 
      |Phone Number |
      |_____________|
            ^
            |  
            |        
      ______|________
      |Depositor     |
	  |_____________ |
      |Account Number|
	  |balance       |
      |______________| 
	        ^
            |  
            |        
      ______|________
      |Borrower      |
	  |_____________ |
      |Loan Number,  |
	  |Loan amount   |
      |______________| 

Identify type of inheritance*/
import java.io.*;
class Customer
{
	String name;
	long ph_no;
	BufferedReader b1;
	void getInfo()
	{
		try
		{
			b1=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the customer name");
			name=b1.readLine();
			System.out.println("Enter the customer Phone no");
			ph_no=Long.parseLong(b1.readLine());
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	void displayInfo()
	{
		System.out.println("Name="+name);
		System.out.println("Phone No="+ph_no);
	}
}
class Depositor extends Customer
{
	int acc_no;
	double balance;
	void getDepositor()
	{
		try
		{
		   System.out.println("Enter the Account No");
		   acc_no=Integer.parseInt(b1.readLine());
		   System.out.println("Enter the Balance");
		   balance=Double.parseDouble(b1.readLine());
	    }
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
	void displayDepositor()
	{
		System.out.println("Acount no="+acc_no);
		System.out.println("balnce amount="+balance);
	}
}
class Borrower extends Depositor
{
	int loan_no;
	double loan_amount;
	void getBorrower()
	{
		try
		{
		   System.out.println("Enter the Loan No");
		   loan_no=Integer.parseInt(b1.readLine());
		   System.out.println("Enter the Loan amount");
		   loan_amount=Double.parseDouble(b1.readLine());
	    }
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
	void displayBorrower()
	{
		System.out.println("Loan no="+loan_no);
		System.out.println("Loan amount="+loan_amount);
	}
    public static void main(String args[])
	{
		Borrower d=new Borrower();
		d.getInfo();
		d.getDepositor();
		d.getBorrower();
		d.displayInfo();
		d.displayBorrower();
		d.displayBorrower();
       
	}
}
/*This is type of Multilevel Inheritance*/