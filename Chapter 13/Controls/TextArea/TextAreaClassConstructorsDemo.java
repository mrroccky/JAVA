/*Write a program to demonstrate constructors of TextArea class constructor.*/
import java.applet.*;
import java.awt.*;
public class TextAreaClassConstructorsDemo extends Applet
{
	TextArea TextArea1,TextArea2,TextArea3,TextArea4;
	public void init()
	{
		TextArea1=new TextArea();
		TextArea2=new TextArea(40,40);
		TextArea3=new TextArea("TextArea3");
		TextArea4=new TextArea("TextArea4",30,30,Scrollbar.VERTICAL);
		add(TextArea1);
		add(TextArea2);
		add(TextArea3);
		add(TextArea4);
	}
	 
}
/*<applet code="TextAreaClassConstructorsDemo.class" width=1366 height=768>
</applet>*/