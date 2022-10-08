/*Write a program to print spelling of enter number from 0 to 9.*/
class SpellingDemo 
{
	public static void main(String[] args) 
	{
		 int a;
		 a=Integer.parseInt(args[0]);
		 if(a==0)
		 {
			 System.out.println("Zero");
		 }
		 else if(a==1)
		 {
			System.out.println("One");
		 }
		 else if(a==2)
		 {
			System.out.println("Two");
		 }
		 else if(a==3)
		 {
			System.out.println("Three");
		 }
		 else if(a==4)
		 {
			System.out.println("Four");
		 }
		 else if(a==5)
		 {
			System.out.println("Five");
		 }
		 else if(a==6)
		 {
			System.out.println("Six");
		 }
		 else if(a==7)
		 {
			System.out.println("Seven");
		 }
		 else if(a==8)
		 {
			System.out.println("Eight");
		 }
		 else if(a==9)
		 {
			System.out.println("Nine");
		 }
		 else
		 {
			System.out.println("Enter no is Invalid");
		 }

	}
}
