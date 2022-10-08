/*
   Write a program to demonstrate getItemCount method of List class.
               OR
   Write a program to count numbers of items in List.
*/
import java.applet.*;
import java.awt.*;
public class GetItemCountMethodOfListClass extends Applet
{
	List List1;
	public void init()
	{
		List1=new List(3);
		List1.add("C");
		List1.add("C++");
		List1.add("Java");
		List1.add("Scala");
		List1.add(".Net");
		List1.add("Python");
		List1.add("PERL");
		List1.add("PHP");
		List1.add("Java Script");
		List1.add("Ruby");
		add(List1);
		System.out.println("Selected index="+List1.getItemCount());
	}
}
/*<applet code="GetItemCountMethodOfListClass.class" width=1366 height=768>
</applet>*/