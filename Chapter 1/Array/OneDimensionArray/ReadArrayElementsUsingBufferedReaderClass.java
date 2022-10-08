/*Write a program to read element of Array using BuffredReader.*/
import java.io.*;
class  ReadArrayElementsUsingBufferedReaderClass
{
	public static void main(String args[]) 
	{
		int a[]=new int[50];
		int i,n;
		BufferedReader b1=new  BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter the n");
			n=Integer.parseInt(b1.readLine());
			System.out.println("Enter the Array Elements:-");
		    for(i=0;i<5;i++)
		    {
              
			  a[i]=Integer.parseInt(b1.readLine());
		    }
			for(i=0;i<5;i++)
		    {
              System.out.println(a[i]);
		    }
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
}