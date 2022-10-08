/* Write a program to demonstrate multiple static blocks in Java*/
class MultipleStaticBlocks 
{
	static 
	{
	   System.out.println("1] Static block 1st is Executed.");
	}
	static 
	{
	   System.out.println("2] Static block 2nd is Executed.");
	}
	static 
	{
	   System.out.println("3] Static block 3rd is Executed.");
	}
	static 
	{
	   System.out.println("4] Static block 4th is Executed.");
	}
	static 
	{
	   System.out.println("5] Static block 5th is Executed.");
	}
    public static void main(String args[]) 
	{
		System.out.println("Main method is Executed");
	}
}
/*
Output:-
         1] Static block 1st is Executed.
		 2] Static block 2nd is Executed.
		 3] Static block 3rd is Executed.
		 4] Static block 4th is Executed.
		 5] Static block 5th is Executed.
		 Main method is Executed
*/

/*
Note:-
         1] We can declare multiple static block in Java.
		 2] Multiple Static block is executed according to they are declared.
		 3] All static blocks are executing before main method.
		 4] After completing execution of static block or static blocks then main method is execute.
		 5] Till JDK 6 we can run Java programs without main method.We can use multiple static block to run program without main. 
		 6] Static blocks only capable of accessing only static data(static variable and static method).
*/
		 
