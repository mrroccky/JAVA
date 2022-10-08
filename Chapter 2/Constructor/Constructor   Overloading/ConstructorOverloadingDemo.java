/*Write a program to demonstrate Constructor Overloading*/
class ConstructorOverloadingDemo 
{
	 ConstructorOverloadingDemo()
	 {
		 System.out.println("You are in Default Constructor");
	 }
	 ConstructorOverloadingDemo(int a)
	 {
		 System.out.println("You are in Parameterized Constructor with one argument");
	 }
	 ConstructorOverloadingDemo(int x,double y)
	 {
		 System.out.println("You are in Parameterized Constructor with two argument");
	 }
	 public static  void main(String args[])
	 {
		 ConstructorOverloadingDemo c1=new ConstructorOverloadingDemo();
		 ConstructorOverloadingDemo c2=new ConstructorOverloadingDemo(2);
		 ConstructorOverloadingDemo c3=new ConstructorOverloadingDemo(2,3.2);
	 }
}
