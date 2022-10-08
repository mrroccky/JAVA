/*Write a program to demonstrate Float data type.*/
class  FloatDataTypeDemo  
{
	public static void main(String[] args) 
	{
		float a=10.23f;
		float b=10.21F;
		float c=10F;
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
		System.out.println("Value of c="+c);
	}
}
/*
Note:-
        1] We can store integer as well as pointing value in float data type.
        2] When we writing decimal point value in Java program it by default 
           consider as double data type.
		3] So when we use float data type along with pointing value while inialization in Java program we
		   must specify F OR f suffix  after it only applicable when inializing float data type only.
		4] When we inialize float data type along with integer value then we need not require f/F suffix after 
		   that value. If we specify f/F suffix after that value compiler never give error and program run 
		   successfully.
		5] When we write f/F with float data type java consider it as float data type value not as 
		   double data type value.
		   
*/ 