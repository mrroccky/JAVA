/* Write a program to demonstrate TextArea class.*/
import java.applet.*;
import java.awt.*;
public class TextAreaClassDemo1 extends Applet
{
	TextArea TextArea1;
	public void init()
	{
		TextArea1=new TextArea(10,10);
		add(TextArea1);
	}
	 
}
/*<applet code="TextAreaClassDemo1.class" width=1366 height=768>
</applet>*/