/*Write a program to check enter number is Positive or not.*/
class PostiveOrNegativeNo
{
	public static void main(String[] args) 
	{
		int a;
		a=Integer.parseInt(args[0]);
		if(a>0)
		{
			System.out.println("Positive no");
		}
		else
		{
			System.out.println("Negative no");
		}
	}
}