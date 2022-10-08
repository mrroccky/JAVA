/* 
   Write a program to demonstrate  delete method of StringBuffer class.
                       OR
   Write a program to demonstrate delete Character at specific index
*/
class StringBufferDeleteCharAtMethodDemo 
{
	public static void main(String args[]) 
	{
		 StringBuffer sb=new StringBuffer("Java");
		 sb.deleteCharAt(3);
		 System.out.println("charcter deleted from 3 index and String is="+sb);
	}
}
