/*
  Write a program to perform linear search and handle following Exceptions.
  1.ArithemeticException.
  2.ArrayIndexOutOfBoundsException.
  3.NegativeArraySizeException.
*/
import java.io.*;
class LinerSeachAlongWithHadlingArithmeticExceptionORNegaArraySizeExceptionORArrayIndexOutOfBoundsExceptionDemo
{
	public static void main(String[] args) 
	{
		int a2,b2,c,index;
		int array[]={1,2,3,4,5};
		int a[]=new int[100];
		int n,i,pos=-1,element;
		int dimension;
		BufferedReader b1;
		b1=new BufferedReader(new InputStreamReader(System.in));
        try
		{
			
			System.out.println("Enter the size of Array");
			n=Integer.parseInt(b1.readLine());
			System.out.println("Enter how many element do want to enter");
            n=Integer.parseInt(b1.readLine());
			System.out.println("Entere the array elements");
			for(i=0;i<n;i++)
		    {
		         a[i]=Integer.parseInt(b1.readLine());
		    }
			System.out.println("Enter the searching Element");
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
				System.out.println("Entered element is found");
			}
			else
			{
				System.out.println("Entered element is not found");
			}
			System.out.println("Enter the first number for division ");
			a2=Integer.parseInt(b1.readLine());
			System.out.println("Enter the second number for division");
			b2=Integer.parseInt(b1.readLine());
			c=a2/b2;
			System.out.println("Enter the Array index ");
			index=Integer.parseInt(b1.readLine());
			array[index]=30;
			System.out.println("Enter the Array dimension");
			dimension=Integer.parseInt(b1.readLine());
			int arr[]=new int[dimension]

		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception due to number/0="+e);
		}
		catch (ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("Exception due to enter index is not present="+e1);
		}
		catch(NegativeArraySizeException e2)
		{
			System.out.println("Exception due to Negative array index/="+e2);
		}
		catch(IOException e3)
		{
			System.out.println(e3);
		}
	}
}
