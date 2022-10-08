/*
Write a program to define class of Library having data members are 
book name, book author, book price read data and display it.
*/
import java.io.*;
class Library
{
		String book_name;
		String book_author;
		double book_price;
		BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		void get()
		{
			try
			{
				System.out.println("Enter the Book Name");
				book_name=b1.readLine();
				System.out.println("Enter the Book Author");
				book_author=b1.readLine();
				System.out.println("Enter the Book Price");
				book_price=Double.parseDouble(b1.readLine());
			}
			catch (IOException e)
			{
				System.out.println(e);
			}
		}
		void display()
	    {

			System.out.println("Book Name="+book_name);
			System.out.println("Book Author="+book_author);
			System.out.println("Book Price="+book_price);
		}
		public static void main(String args[])
	    {
			Library l1=new Library();
			l1.get();
			l1.display();
		}
}