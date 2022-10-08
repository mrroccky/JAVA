/* 
   Write a program to demonstrate Choice class.
                 OR
   Write a program to demonstrate Choice box.
                 OR
   Write a program to demonstrate drop down list.
                 OR
   Write a program to display list of some programming languages in choice box (drop down list).
*/
import java.applet.*;
import java.awt.*;
public class ChoiceClassDemo1 extends Applet
{
	Choice Choice1;
	public void init()
	{
		Choice1=new Choice();
		Choice1.add("C lang");
		Choice1.add("C++");
		Choice1.add("Java");
		Choice1.add("Scala");
		Choice1.add(".Net");
		Choice1.add("Python");
		Choice1.add("PERL");
		Choice1.add("PHP");
		Choice1.add("Java Script");
		Choice1.add("Ruby");
		add(Choice1);
	} 
}
/*<applet code="ChoiceClassDemo1.class" width=1366 height=768>
</applet>*/