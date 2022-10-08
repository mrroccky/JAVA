/*
   Write a program to demonstrate setBackground of List class. 
                  OR
   Write a program to change background color of list.
*/
import java.applet.*;
import java.awt.*;
public class SetBackGroundMethodOfListClass extends Applet
{
	List List1;
	public void init()
	{
		List1=new List(3);
		List1.setBackground(Color.RED);
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
	}
}
/*<applet code="SetBackGroundMethodOfListClass.class" width=1366 height=768>
</applet>*/