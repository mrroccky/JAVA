/*Write a program to make menu driven using if else if ladder OR else if ladder for following choice OR cases.
1->Addition.
2->Substraction.
3->Multiplication.
4->Division.
*/
class MenuDrivenByUsingElseIfLadder 
{
	public static void main(String args[]) 
	{
		 int a,b,c,ch;
		 a=Integer.parseInt(args[0]);
		 b=Integer.parseInt(args[1]);
		 ch=Integer.parseInt(args[2]);
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
}


