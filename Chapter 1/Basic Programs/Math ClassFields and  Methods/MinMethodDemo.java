/*
   Write a program to demonstrate min method of Math class. 
                   OR
   Write a program to find smallest number between two numbers using min method.
*/
class MinMethodDemo 
{
	public static void main(String[] args) 
	{
		 int a,b,c;
		 a=Integer.parseInt(args[0]);
		 b=Integer.parseInt(args[1]);
		 c=Math.min(a,b);
		 System.out.println("Minimum(Smallest) value is="+c);
	}
}
/*
Note:-
      1] This is method of Math class and this class is present in lang package(i.e import java.lang)
	     which implicitly import in every program of Java. 
      2] This method is static method so that it is called by class name(i.e Math.min(arg1,arg2)).
	  3] This method must have two arguments.
	  4] This method must return minimum number between two numbers.
	  5] This method has four forms.
	       a] min(int,int) return min Integer data type.
		   b] min(long,long) return min Long data type.
		   c] min(float,float) return min Float data type.
		   d] min(double,double) return min Double data type.
		   e] min(char,char) return min value of Integer,Long,Float and Double data types.
	  6] Return type of this method must not be Short,Byte Character and Boolean data types.
	  7] That simply means it works with Integer,Long,Float,Double and Character data types.
	   
*/