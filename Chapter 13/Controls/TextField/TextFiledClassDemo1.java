/*
   Write a program to demonstrate TextField class.
               OR
   Write a program to create textFiled (text box) on Applet.
*/
import java.applet.*;
import java.awt.*;
public class TextFiledClassDemo1 extends Applet
{
	TextField TextField1;
	public void init()
	{
		TextField1=new TextField(20);
		add(TextField1);
	}
	 
}
/*<applet code="TextFiledClassDemo1.class" width=1366 height=768>
</applet>*/