/*Write a program to demonstrate append method*/
class StringBufferAppendDemo 
{
	public static void main(String args[]) 
	{
		 StringBuffer sb1,sb2;
		 String s1,s2;
		 s1=args[0];
		 s2=args[1];
		 sb1=new StringBuffer(s1);
		 sb2=new StringBuffer(s2);
		 System.out.println("Append of String is="+sb1.append(sb2));
	}	 
}