/*
    Write a program to demonstrate setBackground method of Button class. 
                     OR
    Write a program to change the background color of Button.
*/
import java.applet.*;
import java.awt.*;
public class ChangeBackgroundColorOfButton extends Applet
{
	Button Button1;
	public void init()
	{
		Button1=new Button("Submit");
		Button1.setBackground(Color.RED);
		add(Button1);
	}
	 
}
/*<applet code="ChangeBackgroundColorOfButton.class" width=1366 height=768>
</applet>*/