/* Write a program to demonstrate setEchoChar method.*/
import java.applet.*;
import java.awt.*;
public class SetEchoCharMethodOfTextFieldClass extends Applet
{
	TextField TextField1;
	public void init()
	{
		TextField1=new TextField(20);
		TextField1.setEchoChar('*');
		add(TextField1);
	}
	 
}
/*<applet code="SetEchoCharMethodOfTextFieldClass.class" width=1366 height=768>
</applet>*/