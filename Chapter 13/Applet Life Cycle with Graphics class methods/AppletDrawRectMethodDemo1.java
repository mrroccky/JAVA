/*
   Write a program to demonstrate drawRect method.
             OR
   Write a program to draw rectangle on Applet. 
*/
import java.applet.*;
import java.awt.*;
public class AppletDrawRectMethodDemo1 extends  Applet
{
	public void paint(Graphics g)
	{
		  g.drawRect(200,200,600,200);
	}
}
/*<applet code="AppletDrawRectMethodDemo1.class" width=1366 height=768>
</applet>*/