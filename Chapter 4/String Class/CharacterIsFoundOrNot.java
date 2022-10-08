/*Write a program to check that enter character is present or not in String.*/
class CharacterIsFoundOrNot
{
	public static void main(String args[]) 
	{
		String a,b;
		char ch;
		int index;
		a=args[0];
		b=args[1];
		ch=b.charAt(0);
		index=a.indexOf(ch);
		if(index==-1)
		{
			System.out.println("Enter character is not present in String");
		}
		else
		{
			System.out.println("Enter character is present in String");
		}
	}
}
/*
   Note:-
         1] This method must return index of only first apperance of specified characeter.
		 2] This method is case sensitive.
		 3] If apperence of character is not found then this method return -1 Integer value.
		 4] Output must be PresentApperanceCharacter-1.
*/