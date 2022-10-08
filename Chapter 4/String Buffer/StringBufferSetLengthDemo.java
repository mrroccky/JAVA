/* Write a program to demonstrate setLength method of String.
                      OR
   Write a program to program set length of enter String.
 */
class StringBufferSetLengthDemo 
{
	public static void main(String args[]) 
	{
		 StringBuffer sb;
		 String s;
		 s=args[0];
		 sb=new StringBuffer(s);
		 System.out.println("String before setting lenth is="+sb);
		 sb.setLength(2);
		 System.out.println("String after setting lenth is="+sb);
	}	 
}
