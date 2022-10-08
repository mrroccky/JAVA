/* Write a program to run Java program without main method using static block*/
class StaticBlockWithoutMainMethod 
{
	static 
	{
	   System.out.println("Static block  is Executed");
	}
}
/*
----------------------------------------------------------------------------------------------
Output for JDK1 To JDK6
Output:-
         Static block  is Executed.
		 Exception in thread "main" java.lang.NoSuchMethodError:main
-----------------------------------------------------------------------------------------------*/


/*
----------------------------------------------------------------------------------------------- 
Output for JDK7  To onward*
Output:-
        Error: Main method not found in class StaticBlockWithoutMainMethod, please define 
		the main method as:public static void main(String[] args)
	 
---------------------------------------------------------------------------------------------*/
/*
Note:-
       1] It is possible to run Java program without main till JDK6 after that we can not run Java program using
	      static block.
	   2] When we use this way without static variable and static method we can not do any thing if we want to  perform any task outside
	      static block
*/