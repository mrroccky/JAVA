/*Write a program to read two matrix A and B and perform Addition of two matrix.*/
import java.io.*;
class AdditionOfTwoMatrix
{
	public static void main(String[] args) 
	{
		int a[][]=new int[3][4];
		int b[][]=new int[10][10];
		int c[][]=new int[10][10];
		int rowA,columnA,rowB,columnB;
		int i,j=0;
		BufferedReader b1;
		b1=new BufferedReader(new InputStreamReader(System.in));
		try
		{
				System.out.println("Entered the row and column for A matrix");
				rowA=Integer.parseInt(b1.readLine());
				columnA=Integer.parseInt(b1.readLine());
				System.out.println("Entered the row and column for B matrix");
				rowB=Integer.parseInt(b1.readLine());
				columnB=Integer.parseInt(b1.readLine());
				if(rowA==rowB&&columnA==columnB)
				{
					System.out.println("Entered the elements for matrix A");

					for(i=0;i<rowA;i++)
					{
						for(j=0;j<columnA;j++)
						{
							a[i][j]=Integer.parseInt(b1.readLine());
						}
					}
					System.out.println("Entered the elements for matrix B");
					for(i=0;i<rowB;i++)
					{
						for(j=0;j<columnB;j++)
						{
							b[i][j]=Integer.parseInt(b1.readLine());
						}
					}
					for(i=0;i<rowA;i++)
					{
						for(j=0;j<columnA;j++)
						{
							c[i][j]=a[i][j]+b[i][j];
						}
					}
					System.out.println("Addition of Matrix is=\n\n\n");
					for(i=0;i<rowA;i++)
					{
						for(j=0;j<columnA;j++)
						{
							System.out.print(c[i][j]+"\t");
						}
						System.out.print("\n");
					}
				}
		}
		catch (IOException e)
		{
			System.out.println(e);
		}

		
	}
}
