/* Write a program to delete String at specific position.And Then find length of that String.*/
class StringBufferDeleteMethodAndFindLengthDemo 
{
	public static void main(String args[]) 
	{
		 StringBuffer sb=new StringBuffer("Java");
		 sb.delete(2,4);
		 System.out.println("String deleted from 1 position  to 2 and String is="+sb);
		 System.out.println("Length of String is="+sb.length());
	}
}
