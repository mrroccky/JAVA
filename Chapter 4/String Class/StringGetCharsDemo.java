/*Write a program to demonstrate getChars method.  */
class StringGetCharsDemo 
{
	public static void main(String args[]) 
	{
		 String a;
		 int startIndex,endIndex;
		 char b[]=new char[1000];
		 a=args[0];
		 startIndex=Integer.parseInt(args[1]);
		 endIndex=Integer.parseInt(args[2]);
		 a.getChars(startIndex,endIndex,b,0);
		 System.out.println(b);
	}
}