/*Write a program to demonstrate fill3DRect method.*/
import java.applet.*;
import java.awt.*;
public class AppletFill3DRectMethodDemo1 extends Applet
{
	public void paint(Graphics g)
	{
		  g.setColor(Color.green);
		  g.fill3DRect(200,200,400,400,true);
	}
}
/*<applet code="AppletFill3DRectMethodDemo1.class" width=1366 height=768>
</applet>*/