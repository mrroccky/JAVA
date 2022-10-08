/* 
    Write a program to demonstrate PI static filed of Math class. 
                OR
    Write a program to display PI value using Math class.
*/
class PIValueDemo
{
	public static void main(String args[]) 
	{
		System.out.println("Value of PI="+Math.PI);
		System.out.printf("Value of PI that is generally used=%.2f\n",Math.PI);
	}
}
/*
   Note:-
         1] This is field of Math class and this class is present in lang package(i.e import java.lang.*)
	        which implcitly import in every program of Java.
		 2] This is static field so that it is called by class name(i.e Math.PI).
		 3] This static field is used display value of PI.
*/

