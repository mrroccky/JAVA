/*Write a program to read element of Array using BuffredReader.*/
import java.util.*;
class  ReadArrayElementsUsingScannerClass
{
	public static void main(String args[]) 
	{
		int a[]=new int[50];
		int i,n;
		Scanner sc=new Scanner(System.in));
		System.out.println("Enter the n");
		n=sc.nextInt();
		System.out.println("Enter the array elements:-");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Elements in Array are:-");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
}
