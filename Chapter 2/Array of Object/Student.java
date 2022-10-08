/*
  Write a program to define class of student having data members are 
  name and roll number where user enter the name and roll number of student 
  accept data  for 5 objects and display them.
 */
import java.io.*;
class Student
{
	String name;
	int roll_no;
	BufferedReader b1;
	void input()
	{
	   try
	   {
		   b1=new BufferedReader(new InputStreamReader(System.in));
		   System.out.println("Enter the name of student");
		   name=b1.readLine();
		   System.out.println("Enter the roll_no of student");
		   roll_no=Integer.parseInt(b1.readLine());
	   }
	   catch (IOException e)
	   {
		 System.out.println("exception="+e);
	   }
	}
	void display()
	{
	   System.out.println("Name of student="+name);
	   System.out.println("Roll no of student="+roll_no);
	}
    public static void main(String[] args) 
	{
		 Student s1[]=new Student[5];
		 int i;
		 for(i=0;i<5;i++)
		 {
			 s1[i]=new Student();
		 }
		 for(i=0;i<5;i++)
		 {
			 s1[i].input();
		 }
		 for(i=0;i<5;i++)
		 {
			 s1[i].display();
		 }


	}
}
