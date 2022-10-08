/*Write a program to demonstrate valueOf method*/  
class StringValueOfDemo
{
	public static void main(String args[]) 
	{
		int i=10;
		long l=10;
		short s=10;
		char c='a';
		byte b=10;
		float f=10.20f;
		double d=10;
		boolean bl=true;
		System.out.println("Interger is coverted into String="+String.valueOf(i));
		System.out.println("Short is coverted into String="+String.valueOf(s));
		System.out.println("Long is coverted into String="+String.valueOf(l));
		System.out.println("Byte is coverted into String="+String.valueOf(b));
		System.out.println("Float is coverted into String="+String.valueOf(f));
		System.out.println("Double is coverted into String="+String.valueOf(d));
		System.out.println("Boolean is coverted into String="+String.valueOf(bl));
		System.out.println("Character is coverted into String="+String.valueOf(c));
    }
}
