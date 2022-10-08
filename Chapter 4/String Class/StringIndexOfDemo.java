/*Write a program to demonstrate indexOf method of String.*/
class StringIndexOfDemo
{
	public static void main(String args[]) 
	{
		String a;
		int index;
		a=args[0];
		index=a.indexOf('e');
		System.out.println("Index is="+index);
		
	}
}
/*
   Note:-
         1] This method must return index of only first apperance of specified characeter.
		 2] This method is case sensitive.
		 3] If apperence of character is not found then this method return -1 Integer value.
		 4] Output must be PresentApperanceCharacter-1.
*/