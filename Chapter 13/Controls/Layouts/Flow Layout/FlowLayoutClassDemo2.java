/*Write a program to get default layout of Applet.*/ 
import java.applet.*;
import java.awt.*;
public class FlowLayoutClassDemo2 extends Applet
{
	Label Label1;
	TextField TextField1;
	public void init()
	{
		Label1=new Label("Java");
		TextField1=new TextField(20);
		setLayout(new FlowLayout());
		add(Label1);
		add(TextField1);
	}
}
/*<applet code="FlowLayoutClassDemo2.class" width=1366 height=768>
</applet>*/
