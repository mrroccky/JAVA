/*Write a program to read element for Two dimension Array*/
import java.io.*;
class TwoDimensionArray1
{
 
     public static void main(String[] args) 
	 {
		 int a[][]=new int[10][10];
		 int row,column,i,j;
		 BufferedReader b1;
		 try
		 {
			    b1=new BufferedReader(new InputStreamReader(System.in));
		        System.out.println("Entered the row column");
				row=Integer.parseInt(b1.readLine());
				column=Integer.parseInt(b1.readLine());
				System.out.println("Enter the array element");
				for(i=0;i<row;i++)
				{
				   for(j=0;j<column;j++)
				   {
					 a[i][j]=Integer.parseInt(b1.readLine());
				   }
				}
				System.out.println("Entered the array elements are ");
				for(i=0;i<row;i++)
				{
				  for(j=0;j<column;j++)
				  {
					System.out.println(a[i][j]);
				  }
			   }
		 }
		 catch (IOException e)
		 {
		 }
         
	 }
}