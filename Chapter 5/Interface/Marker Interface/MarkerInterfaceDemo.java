/* Write a program to demonstrate Marker interface. */
interface MarkerInterface
{

} 
class MarkerInterfaceDemo implements MarkerInterface 
{
	void demo()
	{
		System.out.println("This is marker interface Demo ");
	}
	public static void main(String args[])
	{
		MarkerInterfaceDemo m=new MarkerInterfaceDemo();
		m.demo();
	}

}