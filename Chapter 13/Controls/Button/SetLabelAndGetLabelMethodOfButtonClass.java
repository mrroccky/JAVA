/*Write a program to demonstrate setLabel and getLabel method of Button class.*/
import java.applet.*;
import java.awt.*;
public class SetLabelAndGetLabelMethodOfButtonClass extends Applet
{
	Button Button1,Button2;
	public void init()
	{
		Button1=new Button();
		Button2=new Button("Button2");
		Button1.setLabel("Button1");
		System.out.println("Label of Button2 is="+Button2.getLabel());
		add(Button1);
		add(Button2);
	}
}
/*<applet code="SetLabelAndGetLabelMethodOfButtonClass.class" width=1366 height=768>
</applet>*/