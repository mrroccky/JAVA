 /*
  Write a program to define class of student having data members are 
  name and roll number where user enter the name and roll number of student 
  accept data  for n objects and display them.
 */
import java.io.*;
class Student1 
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
		 Student1 s1[]=new Student1[5];
		 int i,n;
		 BufferedReader b1;
		 try
		 {
             b1=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("how many data  do you want to enter");
			 n=Integer.parseInt(b1.readLine());
			 for(i=0;i<n;i++)
			 {
				s1[i]=new Student1();
			 }
			 for(i=0;i<n;i++)
			 {
				 s1[i].input();
			 }
			 for(i=0;i<n;i++)
			 {
				 s1[i].display();
			 }
		}
	    catch (IOException e)
	    {
		  System.out.println("exception="+e);
	    }
  }  
}