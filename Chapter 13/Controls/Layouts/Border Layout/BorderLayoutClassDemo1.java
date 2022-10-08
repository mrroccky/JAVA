/*Write a program to demonstrate BorderLayout.*/ 
import java.applet.*;
import java.awt.*;
public class BorderLayoutClassDemo1 extends Applet
{
	Button EastButton,WestButton,NorthButton,SouthButton,CenterButton;
	TextField TextField1;
	public void init()
	{
		EastButton=new Button("East Side");
		WestButton=new Button("West Side");
		NorthButton=new Button("North Side");
		SouthButton=new Button("South Side");
		CenterButton=new Button("Center Side");
		setLayout(new BorderLayout());
		add(EastButton,"East");
		add(WestButton,"West");
		add(NorthButton,"North");
		add(SouthButton,"South");
		add(CenterButton,"Center");
	}
}
/*<applet code="BorderLayoutClassDemo1.class" width=1366 height=768>
</applet>*/
