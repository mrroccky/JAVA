/*Write a program to search element using Linear search.*/ 
import java.io.*;
class LinearSearch
{
	public static void main(String[] args) 
	{
		int a[]=new int[50];
		int i,element,pos=-1,n;
		BufferedReader b1;
		try
		{
			
			b1=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the size of Array");
            n=Integer.parseInt(b1.readLine());
			System.out.println("Enter the array element");
			for(i=0;i<n;i++)
		    {
		         a[i]=Integer.parseInt(b1.readLine());
		    }
			System.out.println("Entered the searching Element");
			element=Integer.parseInt(b1.readLine());
			for(i=0;i<n;i++)
		    {
		          if(a[i]==element)
				  {
					  pos=1;
					  break;
				  }
			}
			if(pos==1)
			{
				System.out.println("Enter element is found");
			}
			else
			{
				System.out.println("Enter element is not found");
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
