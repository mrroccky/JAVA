import java.io.*;
class Student
{
	int roll_no;
	String name;
	BufferedReader b1=new BufferedReader(new InputStreamReader(System.in)) ;
	void getStudentInfo()
	{
		try
		{
			System.out.println("Enter the Name");
			name=b1.readLine();
			System.out.println("Enter the Roll no");
			roll_no=Integer.parseInt(b1.readLine());
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	void DisplayStudentInfo()
	{
		System.out.println("Name of Student is="+name);
		System.out.println("Roll no of Student is="+roll_no);
	}
}
class Exam extends Student
{
	String sub[]=new String[60];
	int i,n;
	void getSubject()
	{
		try
		{
			System.out.println("Enter the no for how many no of subject do you want enter");
			n=Integer.parseInt(b1.readLine());
			System.out.println("Enter the subject");
			for(i=0;i<n;i++)
			{
				sub[i]=new String(b1.readLine());
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}
	void displaySubject()
	{
		for(i=0;i<n;i++)
		{
			System.out.println("Name of Subjects is="+sub[i]);
		}
	}
	
}
class Library extends Student
{
	int mem_no;
	void getLibraryInfo()
	{
		try
		{
			System.out.println("Enter the Member number");
			mem_no=Integer.parseInt(b1.readLine());
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	void DisplayLibraryInfo()
	{
		System.out.println("Member No="+mem_no);
	}
	public static void main(String args[])
	{
		Library  l1=new Library();
		Exam e1=new Exam();
		l1.getStudentInfo();
		l1.DisplayStudentInfo();
		l1.getLibraryInfo();
		l1.DisplayLibraryInfo();
		e1.getStudentInfo();
		e1.DisplayStudentInfo();
		e1.getSubject();
		e1.displaySubject();
	}

}