/*Write a program make menu driven for following choices.
1] Even or Odd.
2] Positive or Negative.
3] Leap or not.	*/
import java.io.*;
class MenuDrivenUsingSwitchCase3
{
	public static void main(String args[])
	{
		int evenOrOddnoNumber,postiveOrNegativeNumber,leapOrNot,ch;
		BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("1->Even or Odd");
			System.out.println("2->Positive or Negative");
			System.out.println("3->Leap or Not");
			System.out.println("Enter the choice");
			ch=Integer.parseInt(b1.readLine());
			switch(ch)
			{
				case 1:
							System.out.println("Entered the number");
							evenOrOddnoNumber=Integer.parseInt(b1.readLine());
							if(evenOrOddnoNumber%2==0)
							{
								System.out.println("Entered number is Even");
							}
							else
							{
								System.out.println("Entered number is Odd");
							}
							break;
			  case 2:
				            System.out.println("Entered the number");
							postiveOrNegativeNumber=Integer.parseInt(b1.readLine());
							if(postiveOrNegativeNumber>0)
							{
								System.out.println("Entered number is Positive");
							}
							else
							{
								System.out.println("Entered number is Negative");
							}
							break;
			  case 3:
				            System.out.println("Entered the Year");
							leapOrNot=Integer.parseInt(b1.readLine());
							if(leapOrNot%4==0)
							{
								System.out.println("Entered Year  is Leap");
							}
							else
							{
								System.out.println("Entered Year is not Leap");
							}
							break;
			 default:
				        System.out.println("Entered choice is invalid");
			}
		}
		catch (IOException  e)
		{
			System.out.println(e);
		}
	}
}