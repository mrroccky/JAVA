/* Write a program to demonstrate capacity method of String Class. */
class StringBufferCapacityDemo 
{
	public static void main(String args[]) 
	{
		 StringBuffer sb;
		 String s;
		 s=args[0];
		 sb=new StringBuffer(s);
		 System.out.println("Capacity of String is="+sb.capacity());
	}	 
}