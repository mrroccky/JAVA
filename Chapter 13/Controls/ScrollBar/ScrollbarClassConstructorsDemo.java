/*Write a program to demonstrate constructors of ScrollBar class.*/ 
import java.applet.*;
import java.awt.*;
public class ScrollbarClassConstructorsDemo extends Applet
{
	Scrollbar Scrollbar1,Scrollbar2,Scrollbar3;
	public void init()
	{
		Scrollbar1=new Scrollbar();
		Scrollbar2=new Scrollbar(Scrollbar.HORIZONTAL);
		Scrollbar3=new Scrollbar(Scrollbar.VERTICAL,0,10,0,100);
		add(Scrollbar1);
		add(Scrollbar2);
		add(Scrollbar3);
	}
}
/*<applet code="ScrollbarClassConstructorsDemo.class" width=1366 height=768>
</applet>*/