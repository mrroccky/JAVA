/* 
   Write a program to demonstrate  delete method of StringBuilder Class.
                       OR
   Write a program to demonstrate delete Character at specific index.
*/
class StringBuilderDeleteCharAtMethodDemo 
{
	public static void main(String args[]) 
	{
		 String a="Java";
		 StringBuilder sbd=new StringBuilder(a);
		 sbd.deleteCharAt(3);
		 System.out.println("charcter deleted from 3 index and String is="+sbd);
	}
}
