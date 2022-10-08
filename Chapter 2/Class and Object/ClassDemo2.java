/*Write a program to demonstrate class in Java.*/
class ClassDemo2
{
	  void method1()
	  {
		  System.out.println("You are in method1 of class");
	  }
	  void method2()
	  {
		  System.out.println("You are in method2 of class");
	  }
}
class CallingClassDemo2
{
	 public static void main(String args[])
	 {
		 ClassDemo2 c1=new ClassDemo2();
		 c1.method1();
		 c1.method2();
	  }
}