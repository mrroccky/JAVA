/*
   Write a program to demonstrate fillRect method.
             OR
   Write a program to draw rectangle on Applet and filled it.
*/
import java.applet.*;
import java.awt.*;
public class AppletFillRectMethodDemo1 extends  Applet
{
	public void paint(Graphics g)
	{
		  g.fillRect(200,200,600,200);
	}
}
/*<applet code="AppletFillRectMethodDemo1.class" width=1366 height=768>
</applet>*/