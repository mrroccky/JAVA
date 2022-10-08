 /* Write a program to make parameter as final. */
class FinalParameterDemo
{
	 int a;
	 void get(final int a1)
	 {
		 a=a1;
	 }
	 void display()
	 {
		 System.out.println("Value of a  is using final parameter="+a);
	 }
}
class CallingFinalParameterDemo
{
	 public static void main(String args[])
	 {
		 FinalParameterDemo p1=new FinalParameterDemo();
		 p1.get(12);
		 p1.display();
	 }
}
 
