/*Write a program to demonstrate Double data type.*/
class  DoubleDataTypeDemo  
{
	public static void main(String[] args) 
	{
		double a=10;
		double b=10.23;
		double c=23.10F;
		double d=23.10D;
		double e=10.23d;
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
		System.out.println("Value of c="+c);
		System.out.println("Value of d="+d);
		System.out.println("Value of e="+e);
	}
}

/*
Note:-
        1] We can store integer as well as pointing value in double data type.
        2] By defult all pointing value are consider as double in java.
		3] We do not need to apply any suffix after inializing pointing value for double data type.
		4] But we can specify suffix after inializing pointing value.
		5] We can use D or d as suffix after inializing pointing value to double data type.
		5] When we inialize any value as double data type it take value as double 
		      suppose:-
			            double a=10.23 /*Programmer written statement.
						double a=10.23d /*Above statement taken by Java.
		6] We can also use f/F suffix with double data type because when we write f/F with float 
		   data type java consider it as float data type value and float data type requires 4 bytes and double data type
		   requires 8 bytes that why we can do it we can assign lower data type into higher.
*/				