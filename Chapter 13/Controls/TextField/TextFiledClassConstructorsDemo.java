/* Write a program to demonstrate constructors of TextField class.*/
import java.applet.*;
import java.awt.*;
public class TextFiledClassConstructorsDemo extends Applet
{
	TextField TextField1,TextField2,TextField3,TextField4;
	public void init()
	{
		TextField1=new TextField();
		TextField2=new TextField(20);
		TextField3=new TextField("TextField with constructor");
		TextField4=new TextField("TextField with constructor and also have Column",20);
		add(TextField1);
		add(TextField2);
		add(TextField3);
		add(TextField4);
	} 
}
/*<applet code="TextFiledClassConstructorsDemo.class" width=1366 height=768>
</applet>*/