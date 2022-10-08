import java.io.*;
class D
{
	public static void main(String args[]) 
	{
	     int a,b,c;
		 BufferedReader b1;
		 try
		 {
			
			System.out.println("Enter the a&b");
			a=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
			b=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
			c=a+b;
			System.out.println("Addition="+c);
			 

		  }
		 catch (IOException e)
		 {
			System.out.println("Exception is="+e);
		 }
	}
}