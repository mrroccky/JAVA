/* 
  Write a program to make menu drive  for following Choices or cases
  1.Reverse of String
  2.Concatation of String
  3.Inserting  String
  4.Deleting String
*/  
import java.io.*;
class MenuDriven
{
	String s1,s2,tem,tem1;
	StringBuffer sb1,sb2;
	BufferedReader b1;
	int ch,pos,spos,epos;
	void get()
	{
		try
		{
			b1=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("1->Reverse of String");
			System.out.println("2->Concatation of String");
			System.out.println("3->Inserting  String");
			System.out.println("4->Deleting String");
			System.out.println("Enter the choice");
			ch=Integer.parseInt(b1.readLine());
			switch(ch)
			{
				case 1:
						System.out.println("Enter the string");
						tem=b1.readLine();
						sb1=new StringBuffer(tem);
						System.out.println("Reverse of string is="+sb1.reverse());
						break;
				case 2:
					    System.out.println("Enter the First string");
						s1=b1.readLine();
						System.out.println("Enter the Second string");
						s2=b1.readLine();
						System.out.println("Concation of two string is="+s1.concat(s2));
						break;
				case 3:
					    System.out.println("Enter the string");
						tem=b1.readLine();
						sb1=new StringBuffer(tem);
						System.out.println("Enter the position for entering Sting");
						pos=Integer.parseInt(b1.readLine());
						System.out.println("Enter the string for specified positioin");
						s1=b1.readLine();
						sb1.insert(3,s1);
						System.out.println("String is="+sb1);
						break;
				case 4:
					    System.out.println("Enter the string");
						tem=b1.readLine();
						sb1=new StringBuffer(tem);
					    System.out.println("Enter the start position that you want to delete");
						spos=Integer.parseInt(b1.readLine());
						System.out.println("Enter the last position that you want to delete");
						epos=Integer.parseInt(b1.readLine());
						sb1.delete(spos,epos);
						System.out.println("Remaining String is="+sb1);
						break;
				default:
					    System.out.println("Entered Choice is invalid");
             }
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String args[])
	{
        MenuDriven m1=new MenuDriven();
		m1.get();
	}
}
