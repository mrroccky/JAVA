/*Write a program to demonstrate FlowLayout.*/ 
import java.applet.*;
import java.awt.*;
public class FlowLayoutClassDemo1 extends Applet
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
/*<applet code="FlowLayoutClassDemo1.class" width=1366 height=768>
</applet>*/
