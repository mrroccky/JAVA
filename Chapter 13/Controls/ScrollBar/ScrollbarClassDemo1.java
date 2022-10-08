 /* Write a program to demonstrate ScrollBar class.*/
import java.applet.*;
import java.awt.*;
public class ScrollbarClassDemo1 extends Applet
{
	Scrollbar Scrollbar1,Scrollbar2;
	public void init()
	{
		Scrollbar1=new Scrollbar(Scrollbar.VERTICAL);
		Scrollbar2=new Scrollbar(Scrollbar.HORIZONTAL);
		add(Scrollbar1);
		add(Scrollbar2);
	}
}
/*<applet code="ScrollbarClassDemo1.class" width=1366 height=768>
</applet>*/

