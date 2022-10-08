/*Write a program to draw line in red color and background color is green. */
   
import java.applet.*;
import java.awt.*;
public class AppletDrawLineMethodDemo2 extends  Applet
{
	public void paint(Graphics g)
	{
		  setBackground(Color.GREEN);
		  g.setColor(Color.RED);
		  g.drawLine(200,200,600,200);
	}
}
/*<applet code="AppletDrawLineMethodDemo2.class" width=1366 height=768>
</applet>*/