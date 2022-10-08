/*Write a program to demonstrate Relational operators with Boolean data type.*/
class RelationOperatorsWithBooelanDataType
{
	public static void main(String[] args) 
	{
		 int a,b,c;
		 boolean r1,r2,r3,r4,r5,r6;
		 a=Integer.parseInt(args[0]);
		 b=Integer.parseInt(args[1]);
		 r1=a<b;
		 r2=a>b;
		 r3=a<=b;
		 r4=a>=b;
		 r5=a==b;
		 r6=a!=b;
		 System.out.println("Less than="+r1);
		 System.out.println("Greater than="+r2);
		 System.out.println("Less than equal to="+r3);
		 System.out.println("Greater than equal to="+r4);
		 System.out.println("Equal to="+r5);
		 System.out.println("Not Equal to="+r6);
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
