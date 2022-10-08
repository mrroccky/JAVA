/*Write a program to demonstrate setLabel and getLabel method of Button class.*/
import java.applet.*;
import java.awt.*;
public class SetVisibleMethodOfButtonClass extends Applet
{
	Button Button1;
	public void init()
	{
		Button1=new Button("Submit");
		Button1.setVisible(true);
		add(Button1);
	}
}
/*<applet code="SetVisibleMethodOfButtonClass.class" width=1366 height=768>
</applet>*/