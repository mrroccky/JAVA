/*
  Write a program to demonstrate max method of Math class. 
                       OR
  Write a program to find greatest number between two numbers using max method.
*/

class MaxMethodDemo 
{
	public static void main(String[] args) 
	{
		 char a=89,b=20;
		 short c;
		// a=Integer.parseInt(args[0]);
		 //b=Integer.parseInt(args[1]);
		 c=Math.max(a,b);
		 System.out.println("Maximum(Greatest) value is="+c);
	}
}
/*
Note:-
      1] This is method of Math class and this class is present in lang package(i.e import java.lang)
	     which implicitly import in every program of Java. 
      2] This method is static method so that it is called by class name(i.e Math.max(arg1,arg2)).
	  3] This method must have two arguments.
	  4] This method must return maximum number between two numbers.
	  5] This method has four forms.
	       a] max(int,int) return max Intger data type.
		   b] max(long,long) return max Long data type.
		   c] max(float,float) return max Float data type.
		   d] max(double,double) return max Double data type.
		   e] max(char,char) return max value of Integer,Long,Float and Double data types.
	  6] Return type of this method must not be Short,Byte Character and Boolean data types.
	  7] That simply means it works with Integer,Long,Float,Double and Character data types.
*/