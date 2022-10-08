/* Write a program to demonstrate capacity method of StringBuilder Class.*/
class StringBuilderCapacityDemo
{
	public static void main(String args[]) 
	{
		String a;
		a=args[0];
		StringBuilder sbd=new StringBuilder(a);
		System.out.println("Capacity is="+sbd.capacity());
		 
	}
}
