/*
   Write a program to demonstrate Button.
                OR
   Write a program to display Button “Submit” on Applet.
*/
import java.applet.*;
import java.awt.*;
public class ButtonClassDemo1 extends Applet
{
	Button Button1;
	public void init()
	{
		Button1=new Button("Submit");
		add(Button1);
	}
	 
}
/*<applet code="ButtonClassDemo1.class" width=1366 height=768>
</applet>*/