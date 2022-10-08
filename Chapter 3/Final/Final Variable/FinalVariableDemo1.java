/*Write a program to demonstrate final variable.*/
class FinalVariableDemo1
{
	public static void main(String args[]) 
	{
		final int a;
		a=10;
		System.out.println("Value of final variable is="+a);
	}
}
/*
Note:-
       1] Final is used for define constant that constant value never change. If programmer try to change the value of final 
	      variable value  then error will generate.
	   2] We can define final variable at time of initialize or after declaring  variable. 
	      Example:-
		            final int a=10;
					    OR
					final int a;
					a=10;
		3] Final variable declare in static method or static block.
		4] All variables in interface are by default final.
		    
			For example:-

			interface Student
			{
				int a=10;
			}
			    |
			    |
			    |
			    |
				|   Compile take As follow
               \/


			interface Student
			{
				public staic final int a=10;
			}
			       
*/
