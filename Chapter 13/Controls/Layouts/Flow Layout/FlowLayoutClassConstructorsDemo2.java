/*Write a program to demonstrate FlowLayout(int align,hgap,vgap)constructor of FlowLayout class.*/
import java.applet.*;
import java.awt.*;
public class FlowLayoutClassConstructorsDemo2 extends Applet
{
	TextField TextField1,TextField2,TextField3;
	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.CENTER,20,200));
		TextField1=new TextField(10);
		TextField2=new TextField(10);
		TextField3=new TextField(10);
		add(TextField1);
		add(TextField2);
		add(TextField3);
	}
}
/*<applet code="FlowLayoutClassConstructorsDemo2.class" width=1366 height=768>
</applet>*/