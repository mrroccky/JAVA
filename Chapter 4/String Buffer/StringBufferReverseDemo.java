/*
   Write a program to demonstrate reverse method.
                OR
   Write a program to reverse of  enter String.
*/
class StringBufferReverseDemo 
{
	public static void main(String args[]) 
	{
		 StringBuffer sb;
		 String s;
		 s=args[0];
		 sb=new StringBuffer(s);
		 System.out.println("Reverse of String is="+sb.reverse());
	}	 
}