/* 
    Write a program to demonstrate setCharAt method of StringBuffer Class.
                        OR
    Write a program to set character at 0 position.  
 */
class StringBufferSetCharAtDemo 
{
	public static void main(String args[]) 
	{
		StringBuffer a=new StringBuffer("Pava is language");
		a.setCharAt(0,'J');
		System.out.println(a);
	}
}