 /*
 Write a program to create Generic class in Java.

*/
class GenericClassDemo<T>
{
	  void add(T input)
	  {
			System.out.println(input);
	  }
	   public static void main(String args[])
	   {
		   System.out.println("Generic class for Integer data type");
		   GenericClassDemo<Integer> g1=new GenericClassDemo<Integer>();
		   g1.add(2);
		   g1.add(3);
		   System.out.println("Generic class for Double type");
		   GenericClassDemo<Double> g2=new GenericClassDemo<Double>();
		   g2.add(2.2);
		   g2.add(3.1);
		   System.out.println("Generic class for String type");
		   GenericClassDemo<String> g3=new GenericClassDemo<String>();
		   g3.add("Chetan");
		   g3.add("Mukesh");
	   }
}
