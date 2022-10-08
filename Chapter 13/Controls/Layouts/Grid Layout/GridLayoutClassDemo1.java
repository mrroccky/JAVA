/*Write a program to demonstrate BorderLayout.*/ 
import java.applet.*;
import java.awt.*;
public class GridLayoutClassDemo1 extends Applet
{
	Button Buttons[]=new Button[10];
	String name[]={"0","1","2","3","4","5","6","7","9"};
	int i;
	public void init()
	{
		setLayout(new GridLayout(3,3));
		for(i=0;i<name.length;i++)
		{
			Buttons[i]=new Button(i+"");
			add(Buttons[i]);
		}
	}
}
/*<applet code="GridLayoutClassDemo1.class" width=1366 height=768>
</applet>*/
