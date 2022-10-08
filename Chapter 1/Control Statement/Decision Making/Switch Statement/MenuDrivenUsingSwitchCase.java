/*Write a program to make menu driven for following choices.
1] Addition
2] Subtraction.
3] Multiplication.
4] Division.	
*/
class MenuDrivenUsingSwitchCase 
{
	public static void main(String args[]) 
	{
		 int a,b,c,ch;
	     a=Integer.parseInt(args[0]);
		 b=Integer.parseInt(args[1]);
		 ch=Integer.parseInt(args[2]);
		 switch(ch)
		 {
			  case 1:
				       c=a+b;
				       System.out.println("Addition is="+c);
					   break;
			  case 2:
				       c=a-b;
				       System.out.println("Subtraction is="+c);
					   break;
			  case 3:
				       c=a*b;
				       System.out.println("Multiplication is="+c);
					   break;
			  case 4:
			  
				       c=a/b;
				       System.out.println("Divison is="+c);
					   break;
			   default:
				       System.out.println("Entered choice is invalid");
		 }
	}
}
/*Note:-
         1]We must not define choice variable in long,float and double data type.
		 2]We can not define case in float(pointing) constant directly.
		 3]But we can define case in float(pointing)constant by using type casting into integer,short and byte only.
*/