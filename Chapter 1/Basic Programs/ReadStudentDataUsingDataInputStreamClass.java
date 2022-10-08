/*
   Write a program to demonstrate DataInputStream class.
                      OR
   Write a program to read and display name, roll number and percentage of Student using DataInputStream class
*/
import java.io.*;
class ReadStudentDataUsingDataInputStreamClass
{   
	public static void main(String args[])
	{
		
		String name;
		int rollno;
		double percentage;
		DataInputStream ds;
		try
		{
			
			ds=new DataInputStream(System.in);
			System.out.println("Enter the Name of Student");
			name=ds.readLine();
			System.out.println("Enter the Roll No of Student");
			rollno=Integer.parseInt(ds.readLine());
			System.out.println("Enter the Percentage of Student");
			percentage=Double.parseDouble(ds.readLine());
			System.out.println("Name of Student="+name);
			System.out.println("Roll no of Student="+rollno);
			System.out.println("Percentage of Student="+percentage);
			
		}
		catch (IOException e)
		{
			System.out.println("Exception is due to="+e);
		}
		
	}
}
