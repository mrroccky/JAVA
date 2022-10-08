/* Write a program to implement following inheritance. 
       _____________
      |Dimension    |
	  |_____________|
      |Length,width | 
      |and height   |
      |_____________|
            ^
            |  
            |        
      ______|________
      |Dimension    |
	  |_____________|
      |no_Of_shelves|
	  |             |
      |_____________|
Identify type of inheritance.*/
class dimension
{
	double length=200,width=300,height=2; 
	void dimensionMethod()
	{
		System.out.println("Length="+length);
		System.out.println("Width="+width);
		System.out.println("Height="+height);


	}
}
class  BookSheet extends dimension
{
	 int no_Of_shelves=500;
	 void BookSheetMethod()
	 {
		 System.out.println("No of shelves is="+no_Of_shelves);
	 }
	 public static void main(String args[])
	 {
		 BookSheet b1=new BookSheet();
		 b1.dimensionMethod();
		 b1.BookSheetMethod();
	 }
}

