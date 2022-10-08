/* Write a program to demonstrate Single inheritance.*/
class  A
{
	 void MethodofA()
	 {
		 System.out.println("you are in method of superClass");
	 }
}
class B extends A
{
	 void MethodofB()
	 {
		 MethodofA();
		 System.out.println("you are in method of sub Class");
	 }
	 public static void main(String args[])
	 {
		 B b1=new B();
		 b1.MethodofB();
	 }
}

