/* Write a program to display string in green color where background of Applet is red.*/
import java.applet.*;
import java.awt.*;
public class AppletDisplayingStringInGreenAndBackgroundIsRed extends  Applet
{
	 
	public void paint(Graphics g)
	{
		 setBackground(Color.RED);
		 g.setColor(Color.GREEN);
		 g.drawString("Hello Java",200,200);
	}
}
/*<applet code="AppletDisplayingStringInGreenAndBackgroundIsRed.class" width=1366 height=768>
</applet>*/ 