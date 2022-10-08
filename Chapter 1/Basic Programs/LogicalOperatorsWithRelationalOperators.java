/*Write a program demonstrate Logical operators with Relational operators.*/
class LogicalOperatorsWithRelationalOperators 
{
	public static void main(String args[]) 
	{
	   int  a,b,c;
	   boolean b1,b2,b3;
	   a=Integer.parseInt(args[0]);
	   b=Integer.parseInt(args[1]);
	   c=Integer.parseInt(args[2]);
	   b1=(a>b)&&(a>c);
	   b2=(a>b)||(a>c);
	   b3=!(a>b)||(a>c);
	   System.out.println("AND operator="+b1);
	   System.out.println("OR operator="+b2);
	   System.out.println("NOT operator="+b3);
     }
}
/*
Note:-
       1] Logical operators directly work with boolean data type.
	   2] Logical operators are 
	      
		  ---------------------------------------------------------------
		  | Sr no |  Oprator       |	Meanging                        |
			____________________________________________________________
		  |  1    |       &&       |  AND                               |
			____________________________________________________________
		  |  2    |       ||       |  Greater than                      |
			____________________________________________________________
		  |  3    |       !        |  NOT                               |
			____________________________________________________________
	3] NOT operator is uninary operator(operator has only one operand).
		 
*/	  

