/*Write a program to make menu driven using if else if ladder OR else if ladder for following choice OR cases using BufferedReader.
1->Addition.
2->Subtraction.
3->Multiplication.
4->Division.*/

import java.io.*;
class MenuDrivenByUsingElseIfLadderUsingBufferedReaderClass 
{
	public static void main(String[] args) 
	{
		 int a,b,c,ch;
		 BufferedReader b1;
		 try
		 {
			 b1=new BufferedReader(new InputStreamReader(System.in)); 
			 System.out.println("1]Addition");
			 System.out.println("2]Substraction");
			 System.out.println("3]Multiplication");
			 System.out.println("4]Division");
             System.out.println("Enter the a");
			 a=Integer.parseInt(b1.readLine());
			 System.out.println("Enter the b");
			 b=Integer.parseInt(b1.readLine());
			 System.out.println("Enter the choice");
			 ch=Integer.parseInt(b1.readLine());
			 if(ch==1)
			 {
				 c=a+b;
				 System.out.println("Addition is="+c);
			 }
			 else if(ch==2)
			 {
				 c=a-b;
				 System.out.println("Substraction is="+c);
			 }
			 else if(ch==3)
			 {
				 c=a*b;
				 System.out.println("Multiplication is="+c);
			 }
			 else if(ch==4)
			 {
				 c=a/b;
				 System.out.println("Divison is="+c);
			 }
			 else
			 {
				 System.out.println("Entered choice is invallid");
			 }
		 }
		 catch(IOException e)
		 {
			System.out.println(e);
		 }
	}
}