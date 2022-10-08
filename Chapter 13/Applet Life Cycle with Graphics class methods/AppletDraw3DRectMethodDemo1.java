/* Write a program to demonstrate draw3DRect method.*/
import java.applet.*;
import java.awt.*;
public class AppletDraw3DRectMethodDemo1 extends Applet
{
	public void paint(Graphics g)
	{
		  g.setColor(Color.green);
		  g.draw3DRect(200,200,400,400,true);
	}
}
/*<applet code="AppletDraw3DRectMethodDemo1.class" width=1366 height=768>
</applet>*/