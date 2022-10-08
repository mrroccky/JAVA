/*
   Write a program to demonstrate drawLine method.
               OR
   Write a program to draw line on Applet.
*/

import java.applet.*;
import java.awt.*;
public class AppletDrawLineMethodDemo1 extends  Applet
{
	public void paint(Graphics g)
	{
		  g.drawLine(200,200,600,200);
	}
}
/*<applet code="AppletDrawLineMethodDemo1.class" width=1366 height=768>
</applet>*/