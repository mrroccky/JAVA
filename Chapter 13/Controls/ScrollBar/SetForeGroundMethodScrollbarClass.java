/*
  Write a program to demonstrate setForeground of Scrollbar class. 
                  OR
  Write a program to change foreground color of Scrollbar.
*/
import java.applet.*;
import java.awt.*;
public class SetForeGroundMethodScrollbarClass extends Applet
{
	Scrollbar Scrollbar1;
	public void init()
	{
		Scrollbar1=new Scrollbar(Scrollbar.VERTICAL,0,10,0,100);
		Scrollbar1.setForeground(Color.RED);
		add(Scrollbar1);
		 
	}
}
/*<applet code="SetForeGroundMethodScrollbarClass.class" width=1366 height=768>
</applet>*/