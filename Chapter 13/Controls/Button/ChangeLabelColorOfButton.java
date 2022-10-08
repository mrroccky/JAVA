/*
   Write a program to demonstrate setForeground method of Button class. 
               OR
   Write a program to change color of label of Button.
*/
import java.applet.*;
import java.awt.*;
public class ChangeLabelColorOfButton extends Applet
{
	Button Button1;
	public void init()
	{
		Button1=new Button("Submit");
		Button1.setForeground(Color.RED);
		add(Button1);
	}
	 
}
/*<applet code="ChangeLabelColorOfButton.class" width=1366 height=768>
</applet>*/