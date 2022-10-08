/*
  Write a program to demonstrate setColor method.
              OR
  Write a program to display string in red color on Applet. 

*/
import java.applet.*;
import java.awt.*;
public class AppletSetColorMethodDemo extends  Applet
{
	public void paint(Graphics g)
	{
		 g.setColor(Color.RED);
		 g.drawString("Hello Java",200,200);
	}
}
/*<applet code="AppletSetColorMethodDemo.class" width=1366 height=768>
</applet>*/