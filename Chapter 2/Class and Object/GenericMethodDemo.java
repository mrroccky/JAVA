/*
 Write a program to create Generic method in Java.

*/
class GenericMethodDemo 
{
	<V>void genericMethod(V input)
	   {
		   System.out.println(input);
	   }
	   public static void main(String args[])
	   {
		   GenericMethodDemo g1=new GenericMethodDemo();
		   System.out.println("Your are calling Method for Integer Data type");
		   g1.genericMethod(2);
		   System.out.println("Your are calling Method for Float Data type");
		   g1.genericMethod(2.5);
		   System.out.println("Your are calling Method for Character Data type");
		   g1.genericMethod('C');
		   System.out.println("Your are calling Method for String Data type");
		   g1.genericMethod("Chetan");
	   }
}
