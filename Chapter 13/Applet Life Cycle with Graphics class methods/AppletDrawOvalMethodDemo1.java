/*
   Write a program to demonstrate drawOval method.
             OR
   Write a program to draw circle on Applet.
*/
import java.applet.*;
import java.awt.*;
public class AppletDrawOvalMethodDemo1 extends  Applet
{
	public void paint(Graphics g)
	{
		  g.drawOval(200,200,600,400);
	}
}
/*<applet code="AppletDrawOvalMethodDemo1.class" width=1366 height=768>
</applet>*/