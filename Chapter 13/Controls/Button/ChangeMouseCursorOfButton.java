/*
    Write a program to demonstrate setCursor method of Button class.
                    OR
    Write a program to change arrow cursor into wait cursor. 

*/
import java.applet.*;
import java.awt.*;
public class ChangeMouseCursorOfButton extends Applet
{
	Button Button1;
	public void init()
	{
		Button1=new Button("Submit");
		Button1.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		add(Button1);
	}
	 
}
/*<applet code="ChangeMouseCursorOfButton.class" width=1366 height=768>
</applet>*/