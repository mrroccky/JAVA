/* Write a program to demonstrate Logical operators with Boolean data type.*/
class LogicalOperatorsWithBooleanDataType
{
	public static void main(String[] args) 
	{
		boolean a=true,b=false; 
		boolean AND,OR,NOT;
		AND=a&&b;
		OR=a||b;
		NOT=!a;
		System.out.println("AND="+AND);
		System.out.println("OR="+OR);
		System.out.println("NOT="+NOT);
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
