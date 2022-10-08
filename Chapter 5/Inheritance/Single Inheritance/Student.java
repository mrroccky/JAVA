/*Write program to implement following inheritance

       _____________
      |Student      |
	  |_____________|
      |Name         | 
      |Roll Number  |
      |_____________|
            ^
            |  
            |        
      ______|________
      |Library      |
	  |_____________|
      |Member       |
	  |Number       |
      |_____________|
Identify type of inheritance.
      
*/
class Student
{
	int roll_No;
	String name;
	void input(String s,int n)
	{
		roll_No=n;
		name=s;
    }
	void display()
	{
	   System.out.println("Name of Student is="+name);
	   System.out.println("Roll no of Student is="+roll_No);
	}
}
class  Library extends Student
{
	 int member_no;
	 void get(int n)
	 {
         member_no=n;
		 System.out.println("Member number is="+member_no);
	 }
	 public static void main(String args[])
	 {
		 String n;
		 int r,mn;
		 Library b1=new Library();
		 n=args[0];
		 r=Integer.parseInt(args[1]);
		 mn=Integer.parseInt(args[2]);
		 b1.input(n,r);
		 b1.display();
		 b1.get(mn);
	 }
}
/*This is type of Single Inheritance*/