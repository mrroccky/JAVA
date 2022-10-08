/*
   Write a program to rectangle where edge of rectangle is rounded.
             OR
   Write a program to demonstrate drawRoundRect method.
 */
import java.applet.*;
import java.awt.*;
public class AppletDrawRoundRectMethodDemo1 extends  Applet
{
	public void paint(Graphics g)
	{
		  g.drawRoundRect(200,200,600,200,20,20);
	}
}
/*<applet code="AppletDrawRoundRectMethodDemo1.class" width=1366 height=768>
</applet>*/