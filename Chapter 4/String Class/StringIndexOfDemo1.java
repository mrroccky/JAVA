/*Write a program to demonstrate indexOf method*/
class StringIndexOfDemo1
{
	public static void main(String args[]) 
	{
		String a;
		int index;
		a=args[0];
		index=a.indexOf("an");
		System.out.println("Index is="+index);
		
	}
}
/*
   Note:-
         1] This method must return index of only first apperance of specified characeter sequence(sub String)".
		 2] This method is case sensitive.
		 3] If apperence of character is not found then this method return -1 Integer value.
		 4] Output must be PresentApperanceCharacter-1.
*/