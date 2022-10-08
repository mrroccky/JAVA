/* 
  Write a program to demonstrate insert method.
                  OR
   Write a program to insert string at pariticular position.*/
class StringBufferInsertMethodDemo 
{
	public static void main(String args[]) 
	{
		 StringBuffer sb=new StringBuffer("Ja");
		 sb.insert(1,"av");
		 System.out.println("String is entered at 2 position and String is="+sb);
	}
}
