/*Write a program to read and display name, roll number and percentage of Student using Scanner class.*/
import java.util.*;
class ReadStudentDataUsingScannerClass
{
	public static void main(String args[])
	{
		String name;
		int rollno;
		double percentage;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the Name of Student");
		name=Sc.nextLine();
		System.out.println("Enter the Roll No of Student");
		rollno=Sc.nextInt();
		System.out.println("Enter the Percentage of Student");
		percentage=Sc.nextDouble();
		System.out.println("Name of Student="+name);
		System.out.println("Roll no of Student="+rollno);
		System.out.println("Percentage of Student="+percentage);
	}
}



	
