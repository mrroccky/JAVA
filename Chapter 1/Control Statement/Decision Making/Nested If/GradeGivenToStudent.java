/*Write a program to give grade according following creteria.
1] Per>=75 And Per<=100 
        A+ Grade.
2] Per>=60 And Per<75.
        A Grade.
3] Per>=45 And Per<60.
        B Grade
4] Per>=35 And Per<45.
         C Grade
*/
import java.io.*;
class GradeGivenToStudent
{
	public static void main(String args[])
	{
		int mark1,mark2,mark3,mark4,mark5,total;
		double per;
		BufferedReader b1;
		try
		{
		    b1=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Mark of 5 Subjects");
			mark1=Integer.parseInt(b1.readLine());
			mark2=Integer.parseInt(b1.readLine());
			mark3=Integer.parseInt(b1.readLine());
			mark4=Integer.parseInt(b1.readLine());
			mark5=Integer.parseInt(b1.readLine());
			total=mark1+mark2+mark3+mark4+mark5;
			per=(double)total/500*100;
			System.out.println("Total="+total);
			System.out.println("Percentage="+per);
			if(mark1>=35&&mark2>=35&&mark3>=35&&mark4>=35&&mark5>=35)
			{
					if(per>=75&&per<=100)
					{
						System.out.println("A+ grade");
					}
					else if(per>=60&&per<=74)
					{
						System.out.println("A grade");
					}
					else if(per>=45&&per<=59)
					{
						System.out.println("B grade");
					}
					else if(per>=35&&per<=44)
					{
						System.out.println("C grade");
					
					}
			}
			else
			{
				System.out.println("Fail");
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}