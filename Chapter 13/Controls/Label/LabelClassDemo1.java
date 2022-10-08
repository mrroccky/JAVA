/*
   Write a program to demonstrate Label.
             OR
   Write a program to display “Java” label on Applet.
*/
import java.applet.*;
import java.awt.*;
public class LabelClassDemo1 extends Applet
{
	Label Label1;
	public void init()
	{
		Label1=new Label("Java");
		add(Label1);
	}
	 
}
/*<applet code="LabelClassDemo1.class" width=1366 height=768>
</applet>*/