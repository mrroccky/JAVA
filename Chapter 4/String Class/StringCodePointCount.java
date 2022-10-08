/*Write a program to demonstrate codePointCount method of String.*/
class StringCodePointCount
{
	public static void main(String args[]) 
	{
		String a;
		int beginIndex,lastIndex;
		a=args[0];
		beginIndex=Integer.parseInt(args[1]);
		lastIndex=Integer.parseInt(args[2]);
		System.out.printf("Unicode is=%x",a.codePointCount(beginIndex,lastIndex));
	}
}
