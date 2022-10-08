 /*
     Write a program to demonstrate DrawPloygon.
	               OR
	 Write a program to draw polygon
*/
import java.applet.*;
import java.awt.*;
public class AppletDrawPolygonMethod extends  Applet
{
	int x[]={100,140,200,210};
	int y[]={140,300,500,100};
	public void paint(Graphics g)
	{
		g.drawPolygon(x,y,4);
	}
}
/*<applet code="AppletDrawPolygonMethod.class" width=200 height=200>
</applet>*/