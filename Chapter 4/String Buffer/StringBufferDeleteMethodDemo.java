/* Write a program to demonstrate delete method of StringBuffer class.
                OR
   Write a program to delete String at specific position.
 */
class StringBufferDeleteMethodDemo 
{
	public static void main(String args[]) 
	{
		 StringBuffer sb=new StringBuffer("Java");
		 sb.delete(2,4);
		 System.out.println("String deleted from 1 position  to 2 and String is="+sb);
	}
}
