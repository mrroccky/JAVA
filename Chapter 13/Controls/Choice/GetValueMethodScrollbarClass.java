/*Write a program to demonstrate getMinimum and getMaximum method of Scrollbar class.*/ 
import java.applet.*;
import java.awt.*;
public class GetValueMethodScrollbarClass extends Applet
{
	Scrollbar Scrollbar1;
	public void init()
	{
		Scrollbar1=new Scrollbar(Scrollbar.VERTICAL,0,10,0,100);
		add(Scrollbar1);
		System.out.println("Value of scroll bar is="+Scrollbar1.getValue());
	}
}
/*<applet code="GetValueMethodScrollbarClass.class" width=1366 height=768>
</applet>*/