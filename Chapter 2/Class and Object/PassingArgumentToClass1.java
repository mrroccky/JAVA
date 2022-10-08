/*Write a program to demonstrate passing argument to class. */
class PassingArgumentToClass1
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
class ClassForCallingPassingArgumentToClass1
{
	 public static void main(String args[])
	 {
		 PassingArgumentToClass1 p1=new PassingArgumentToClass1();
		 p1.get("Chetan",1);
		 p1.display();
	 }
}
