/*Write a program to demonstrate codePointAt method of String.
                 OR
  Write a program to print Unicode of specified character.*/
class StringCodePointAtDemo 
{
	public static void main(String args[]) 
	{
		String a;
		int index;
		a=args[0];
		index=Integer.parseInt(args[1]);
		System.out.printf("Unicode is=%x",a.codePointAt(index));
	}
}
