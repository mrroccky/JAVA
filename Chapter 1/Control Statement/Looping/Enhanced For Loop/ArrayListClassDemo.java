/*Write a program to demonstrate Enhanced for loop and use ArrayList class
               OR
  Write a program to display some Programming language names using Enhanced for loop and 
  use ArrayList Class*/
import java.util.*;
class ArrayListClassDemo 
{
	public static void main(String args[]) 
	{
		ArrayList<String> name_of_lang=new ArrayList<String>();

		name_of_lang.add("C language");
		name_of_lang.add("C++");
		name_of_lang.add("Java");
		name_of_lang.add("PHP");
		name_of_lang.add(".Net");
		for(String names:name_of_lang)
		{
			System.out.println(names); 
		}
	}
}
