/*Write a program to demonstrate Generic constructor.*/
class GenericClassConstructorDemo 
{
	<T>GenericClassConstructorDemo(T item)
	{
		System.out.println("Passing argument is="+item);
	}
}
class CallingForGenericConstructorDemo
{
	public static void main(String args[])
	{
		GenericClassConstructorDemo g1=new GenericClassConstructorDemo(10);
		GenericClassConstructorDemo g2=new GenericClassConstructorDemo(10.23);
		GenericClassConstructorDemo g3=new GenericClassConstructorDemo(1000000);
		GenericClassConstructorDemo g4=new GenericClassConstructorDemo('C');
		GenericClassConstructorDemo g5=new GenericClassConstructorDemo("Chetan");
	}
}
