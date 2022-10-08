/*
   Write a program to demonstrate fillOval method.
              OR
   Write a program to draw circle on Applet and filled it.
*/
import java.applet.*;
import java.awt.*;
public class AppletFillOvalMethodDemo1 extends  Applet
{
	public void paint(Graphics g)
	{
		  g.fillOval(200,200,600,400);
	}
}
/*<applet code="AppletFillOvalMethodDemo1.class" width=1366 height=768>
</applet>*/