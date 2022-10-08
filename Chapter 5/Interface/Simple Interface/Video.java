/*
 Write a program to implements following inheritance.
                 OR
 Write a program to demonstrate multiple inheritance.

      ________________                 ________________
	  | Movie         |                |    Music      |
	  |_____________  |                |_______________|
      |Rating         |                |void print()   |
      |void Display() |                |               |
      |_______________|                |_______________|
            ^                                 ^
            |                                 |
            |                                 |
			|                                 |
            |                                 |
            |_________________________________|
                           |                         
                           | 
                           |   
	                 ______|________
                     |Video        |
	                 |_____________|
                     |Title        |
	                 |Length       |
                     |_____________|
			
*/
interface Movie 
{
   double rating=3.1;
   void display();
} 
class Music  
{
	int catogary=1;
	void print()
	{
		System.out.println("Catogary is="+catogary);
	}
} 
class Video extends Music implements Movie  
{
	String title="Hero";
	double length=4.5;
	public void display()
	{
       print();
	   System.out.println("Rating is="+rating);
	}
    void show()
	{
		display();
		System.out.println("Title is="+title);
		System.out.println("Length is="+length);
		
	}
	public static void main(String args[])
    {
		Video v=new Video();
		v.show();
	}

}
