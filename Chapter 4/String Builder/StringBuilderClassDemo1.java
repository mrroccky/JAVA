/* 
   Write a program to demonstrate StringBuilder class.
 */
class StringBuilderClassDemo1
{
	public static void main(String args[]) 
	{
		StringBuffer sb=new StringBuffer(args[0]);
		StringBuilder sbd=new StringBuilder(sb);
		System.out.println(sbd);
		 
	}
}
