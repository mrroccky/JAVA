/*
Wap to define class of Bank account.Define appropriate data members for same.
       Write method to do following 
		  i)To assign initial values.
		  ii)To deposit an amount
		  iii)To withdraw an amount after checking for Balance 
		  iv)To display the name and Adress
*/

import java.io.*;
class Bank_Account
{
	String accountHolderName,accountHolderAddress;
	int accountNo;
	double Bal,deposit,withdraw1;
	BufferedReader b1=new BufferedReader(new InputStreamReader(System.in)); 
	void personInfo()
	{
		try
		{
			System.out.println("Enter the AccountHolder name");
			accountHolderName=b1.readLine();
			System.out.println("Account number");
			accountNo=Integer.parseInt(b1.readLine());
			System.out.println("AccountHolder Address");
			accountHolderAddress=b1.readLine();;
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	void initialBalance()
	{
		Bal=500;
	}
	void deposit()
	{
		try
		{
			System.out.println("Enter amount for deposit");
			deposit=Double.parseDouble(b1.readLine());
			Bal=deposit+Bal;
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	void withdraw()
	{
		try
		{
			System.out.println("Enter withdraw amount");
			withdraw1=Double.parseDouble(b1.readLine());
			if(withdraw1<Bal)
			{
				Bal=deposit-withdraw1;
			}
			else
			{
				System.out.println("amount is greater than bal");
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	void display()
	{
		System.out.println("AccounHolder Name is="+accountHolderName);
	    System.out.println("AccounHolder Address is="+accountHolderAddress);
        System.out.println("Balance is="+Bal);
	}
	public static void main(String args[])
	{
		Bank_Account b=new Bank_Account();
	    b.personInfo();
		b.initialBalance();
		b.deposit();
        b.withdraw();
		b.display();
	}
}