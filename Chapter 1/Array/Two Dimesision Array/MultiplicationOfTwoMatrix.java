/*Write a program to read two matrix A and B and perform  Multiplication of two matrix*/
import java.io.*;
class MultiplicationOfTwoMatrix
{
 
     public static void main(String[] args) 
	 {
		 int a[][]=new int[10][10];
		 int b[][]=new int[10][10];
		 int mul[][]=new int[10][10];
		 int row,column;
		 int i,j;
		 int row1,column1,k;
		 BufferedReader b1;
		 try
		 {
			    b1=new BufferedReader(new InputStreamReader(System.in));
		        System.out.println("Entered the row and column for A matrix");
				row=Integer.parseInt(b1.readLine());
				column=Integer.parseInt(b1.readLine());
				System.out.println("Enter the array elements for A matrix");
				for(i=0;i<row;i++)
				{
				   for(j=0;j<column;j++)
				   {
					 a[i][j]=Integer.parseInt(b1.readLine());
				   }
				}
				System.out.println("Entered the row and column for B matrix");
				row1=Integer.parseInt(b1.readLine());
				column1=Integer.parseInt(b1.readLine());
				System.out.println("Enter the array element for B matrix");
				for(i=0;i<row;i++)
				{
				   for(j=0;j<column;j++)
				   {
					 b[i][j]=Integer.parseInt(b1.readLine());
				   }
				}
				for(i=0;i<row;i++)
				{
				  for(j=0;j<column1;j++)
				  {
					 for(k=0;k<column;k++)
					 {
						 mul[i][j]=a[i][k]*b[k][j];
					 }
				  }
			   }
			   for(i=0;i<row;i++)
				{
				   for(j=0;j<column1;j++)
				   {
					    System.out.println(mul[i][j]);
				   }
				}
		 }
		 catch (IOException e)
		 {
		 }
         
	 }
}