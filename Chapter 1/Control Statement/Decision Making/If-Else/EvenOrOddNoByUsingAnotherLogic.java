/*Write a program to check enter number is Even or Odd using another logic.*/
class EvenOrOddNoByUsingAnotherLogic
{
	public static void main(String args[]) 
	{
		int a;
		a=Integer.parseInt(args[0]);
		if(a%10==0||a%10==2||a%10==4||a%10==6||a%10==8)
		{
			System.out.println("Entered no is Even");
		}
		else
		{
			 System.out.println("Entered no is Odd");
		}
	}
}
