/*Write a program to call constructor without creating object.*/
class CallingDefaultConstructorWithoutCreatingObject
{
	String name ;
	int roll_no;
	CallingDefaultConstructorWithoutCreatingObject()
	{
		name="John";
		roll_no=1;
	}
	void display()
	{
		System.out.println("Name of Student is="+name);
		System.out.println("Roll number of Student is="+roll_no);
	}
	public static void main(String args[])
	{
		new CallingDefaultConstructorWithoutCreatingObject().display();
	}
}