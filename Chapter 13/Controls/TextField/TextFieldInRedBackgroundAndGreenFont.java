 /* Write a program to display textfield in red and display font in green.*/
import java.applet.*;
import java.awt.*;
public class TextFieldInRedBackgroundAndGreenFont extends Applet
{
	TextField TextField1;
	public void init()
	{
		TextField1=new TextField(20);
		TextField1.setBackground(Color.RED);
		TextField1.setForeground(Color.GREEN);
		add(TextField1);
	}
	 
}
/*<applet code="TextFieldInRedBackgroundAndGreenFont.class" width=1366 height=768>
</applet>*/