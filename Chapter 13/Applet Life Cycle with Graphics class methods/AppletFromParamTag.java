 /*
     Write a program to demonstrate getParameter.
	               OR
	 Write a program to demonstrate param tag
*/
import java.applet.*;
import java.awt.*;
public class AppletFromParamTag extends  Applet
{
	String meg;
	public void init()
	{
		meg=getParameter("name1");
	}
	public void paint(Graphics g)
	{
		g.drawString("String From Param tag is="+meg,200,200);
	}
}
/*<applet code="AppletFromParamTag.class" width=300 height=200>
<param name="name1" value="Java">
</applet>
*/