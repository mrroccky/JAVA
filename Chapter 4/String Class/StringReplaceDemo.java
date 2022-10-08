/*
   Write a program to demonstrate replace method of String.
               OR
   Write program to change character P to J.

*/ 
class StringReplaceDemo 
{
	public static void main(String args[]) 
	{
		String a="This is Pava.I like to make program in Pava";
		String a1;
		System.out.println("Before\n\n\n"+a);
		a=a.replace('P','J');
		System.out.println("\n\nAfter\n\n");
		System.out.print(a+"\n\n\n");
	}
}
/*
    Note:-
	      1] This method replace old character by specified character.
		  2] We this method replace old character by new character that it sense case.
		  3] This method is case sensitive.
*/
