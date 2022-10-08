/*
  Write a program to rectangle where edge of rectangle is rounded and fiiled it.
             OR
  Write a program to demonstrate fillRoundRect method. 
*/
import java.applet.*;
import java.awt.*;
public class AppletFillRoundRectMethodDemo1 extends Applet
{
	public void paint(Graphics g)
	{
		  g.fillRoundRect(200,200,600,200,20,20);
	}
}
/*<applet code="AppletFillRoundRectMethodDemo1.class" width=1366 height=768>
</applet>*/