/*
   Write a program to draw Arc on Applet.
              OR
   Write a program to demonstrate drawArc method.
*/
import java.applet.*;
import java.awt.*;
public class AppletDrawArcMethodDemo1 extends Applet
{
	public void paint(Graphics g)
	{
		  g.drawArc(200,100,600,200,50,300);
	}
}
/*<applet code="AppletDrawArcMethodDemo1.class" width=1366 height=768>
</applet>*/