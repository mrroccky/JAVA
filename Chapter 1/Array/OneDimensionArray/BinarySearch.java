import Java.Basic.*;
import java.io.BufferedReader;
import java.util.Scanner;

/*Write a program to search element using Binary search*/
public class BinarySearch{
	public static void main(String[] args) {
		int a[]=new int[50];
		int i,element,pos=-1,n,mid,first=0,last,postition;
		BufferedReader b1;
		try
		{
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Entered the size of Array");
            n=Integer.parseInt(scanner.nextLine());
			last=n-1;
			System.out.println("Entered the array element");
			for(i=0;i<n;i++)
		    {
		         a[i]=Integer.parseInt(scanner.nextLine());
		    }
			System.out.println("Entered the searching Element");
			element=Integer.parseInt(scanner.nextLine());
			
			for(i=0;i<n;i++)
			{
				mid=(first+last)/2;
				if(a[mid]==element)
				{
					pos=1;
					break;
				}
				else if(a[mid]<element)
				{
					last=mid-1;
				}
				else
				{
					first=mid+1;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		if(pos==1)
		{
			System.out.println("Entered Element is Found");
		}
		else
		{
			System.out.println("Entered Element is not Found");
		}
	}
}





