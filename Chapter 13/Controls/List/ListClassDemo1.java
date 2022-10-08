/*
   Write a program demonstrate List class.
           OR
   Write a program to display list of some programming languages in list.
*/
import java.applet.*;
import java.awt.*;
public class ListClassDemo1 extends Applet
{
	List List1;
	public void init()
	{
		List1=new List(2);
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
/*<applet code="ListClassDemo1.class" width=1366 height=768>
</applet>*/