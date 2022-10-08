/*Write a program to run Applet using H.T.M.L.*/
import java.applet.*;
import java.awt.*;
public class AppletDrawStringMethodDemoAndRunOnHTML extends  Applet
{
	public void paint(Graphics g)
	{
		 g.drawString("Hello Java",200,200);
	}
}
/*<applet code="AppletDrawStringMethodDemoAndRunOnHTML.java" width=16 height=78>
</applet>*/