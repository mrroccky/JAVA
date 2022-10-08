/*Write a program make menu driven for following choices.
1] Addition
2] Subtraction.
3] Multiplication.
4] Division.	
          OR	
Write a program make menu driven for Arithmetic Operations.
Here use floating as case value.
*/
import java.io.*;
class MenuDrivenUsingSwitchCase2
{
	public static void main(String args[]) throws IOException
	{
		     int a,b,c;
			 byte ch;
		     BufferedReader b1;
			 b1=new BufferedReader(new InputStreamReader(System.in));
			 System.out.println("1]Addition");
			 System.out.println("2]Subtraction");
			 System.out.println("3]Multiplication");
			 System.out.println("4]Division");
			 System.out.println("Enter the choice");
			 ch=Byte.parseByte(b1.readLine());
             System.out.println("Enter the a");
			 a=Integer.parseInt(b1.readLine());
			 System.out.println("Enter the b");
			 b=Integer.parseInt(b1.readLine());
			 switch(ch)
			 {
			    case (int)1.1:
							 c=a+b;
							 System.out.println("Addition is="+c);
							 break;
			    case (int)2.2:
				             c=a-b;
				             System.out.println("Subtraction is="+c);
					         break;
			    case (int)3.3:
				             c=a*b;
				             System.out.println("Multiplication is="+c);
					         break;
			    case (int)4.4:
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