/*  Write a program to perform mod operation on entered numbers.
                       OR
    Write a program to find Reminder of entered two numbers.
*/
class Reminder
{
	public static void main(String args[])
	{
			int a,b,c;
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a%b;
			System.out.println("Mod Operation is on Integer data type is="+c);
	}
}
/*
   Note:-
         1] Mod operator is used for finding reminder on applied numbers.
		 2] It is applicable on Integer, Float , Double data types but this is not applicable in C Language and C++.
		 3] That means in C language and C++ mod operator is applicable on Integer data type only.
		    For More detail Please see Mod.cpp file where this program file is saved.
*/