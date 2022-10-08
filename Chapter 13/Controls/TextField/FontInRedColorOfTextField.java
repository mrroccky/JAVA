/* Write a program to display font (text) in textfield(textbox) in red.*/
import java.applet.*;
import java.awt.*;
public class FontInRedColorOfTextField extends Applet
{
	TextField TextField1;
	public void init()
	{
		TextField1=new TextField(20);
		TextField1.setForeground(Color.RED);
		add(TextField1);
	}
	 
}
/*<applet code="FontInRedColorOfTextField.class" width=1366 height=768>
</applet>*/