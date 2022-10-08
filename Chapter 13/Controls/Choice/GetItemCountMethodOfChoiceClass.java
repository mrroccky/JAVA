/*
   Write a program to demonstrate getItemCount method of Choice class.
               OR
   Write a program to count numbers of items in choice.
*/
import java.applet.*;
import java.awt.*;
public class GetItemCountMethodOfChoiceClass extends Applet
{
	Choice Choice1;
	public void init()
	{
		Choice1=new Choice();
		Choice1.setBackground(Color.red);
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
		System.out.println("Selected index="+Choice1.getItemCount());
		add(Choice1);
	} 
}
/*<applet code="GetItemCountMethodOfChoiceClass.class" width=1366 height=768>
</applet>*/