/* Write a program to demonstrate TextArea class.*/
import java.applet.*;
import java.awt.*;
public class SetBackGroundMethodOfTextAreaClass extends Applet
{
	TextArea TextArea1;
	public void init()
	{
		TextArea1=new TextArea(30,50);
		TextArea1.setBackground(Color.red);

		add(TextArea1);
	}
	 
}
/*<applet code="SetBackGroundMethodOfTextAreaClass.class" width=1366 height=768>
</applet>*/