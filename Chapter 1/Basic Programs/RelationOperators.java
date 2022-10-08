/* Write a program to demonstrate Relational operators.*/
class RelationOperators
{
	public static void main(String[] args) 
	{
		 int a,b,c;
		 a=Integer.parseInt(args[0]);
		 b=Integer.parseInt(args[1]);
		 System.out.println("Less than="+(a<b));
		 System.out.println("Greater than="+(a>b));
		 System.out.println("Less than equal to="+(a<=b));
		 System.out.println("Greater than equal to="+(a>=b));
		 System.out.println("Equal to="+(a==b));
		 System.out.println("Not Equal to="+(a!=b));
	}
}
/*
Note:-
       1] Relation operators evalute boolean literal i.e either true or false.
	   2] Relation operators are 
	      
		  ---------------------------------------------------------------
		  | Sr no |  Oprator       |	Meanging                        |
			____________________________________________________________
		  |  1    |       <        |  Less than                         |
			____________________________________________________________
		  |  2    |       >        |  Greater than                      |
			____________________________________________________________
		  |  3    |       <=       |  Less than equal                   |
			____________________________________________________________
		  |  4    |       >=       |   Grater than equal                |
			____________________________________________________________
		  |  5    |       ==       |   Equal to                         |
			____________________________________________________________
		  |  6    |      !=        | Not equal to                       | 
		  _______________________________________________________________
*/	  
