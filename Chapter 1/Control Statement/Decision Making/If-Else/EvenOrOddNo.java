/*Write a program to check enter number is Even or Odd.*/ 
class EvenOrOddNo
{
	public static void main(String[] args) 
	{
		int a;
		a=Integer.parseInt(args[0]);
		if(a%2==0)
		{
			System.out.println("Entered no is Even");
		}
		else
		{
			 System.out.println("Entered no is Odd");
		}
	}
}
