/*Write a program to read data from user by using pass by argument.*/
class PassingArgumentToClass2
{
	 String name;
	 int roll_no;
	 void get(String name1,int roll_no1)
	 {
		 name=name1;
		 roll_no=roll_no1;
	 }
	 void display()
	 {
		 System.out.println("Name is="+name);
		 System.out.println("Roll no is="+roll_no);
	 }
}
class ClassForCallingPassingArgumentToClass2
{
	 public static void main(String args[])
	 {
		 PassingArgumentToClass2 p1=new PassingArgumentToClass2();
		 int r;
		 String n;
		 n=args[0];
		 r=Integer.parseInt(args[1]);
		 p1.get(n,r);
		 p1.display();
	 }
}
