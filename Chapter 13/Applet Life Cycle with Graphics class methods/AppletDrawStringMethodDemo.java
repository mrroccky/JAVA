/*
  Write a program to display a String on Applet.
              OR
  Write a program to demonstrate drawString method.
              OR
  Write a program to display “Hello Java” on Applet at 200 and 200 position. 

*/
import java.applet.*;
import java.awt.*;
public class AppletDrawStringMethodDemo extends  Applet
{
	public void paint(Graphics g)
	{
		 g.drawString("Hello Java",200,200);
	}
}
/*<applet code="AppletDrawStringMethodDemo.class" width=1366 height=768>
</applet>*/