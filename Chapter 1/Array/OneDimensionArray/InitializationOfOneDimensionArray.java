/*Write a program to demonstrate Initialization of One dimension Array.*/
class InitializationOfOneDimensionArray  
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5},i;
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
}
/*
Note:-
       1]We can not specified size directly in between script of Array in Java.But This can do in C and C++.
	       i.e  1] int a[]={1,2,3,4,5}; //Legal in C,C++ and Java.
		        2] int a[5]={1,2,3,4,5};//Legal in C,C++ but invalid in Java.
				3] We can create boolean array but we  must store boolean literal.
				4] We can perform type casting in initialization of array.
				     i.e  int a[]={1,2,3,4,(int)5.5}.
*/