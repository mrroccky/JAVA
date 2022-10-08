/* Write a program to make textfield (textbox) that cannot be modified(i.e not Editable).*/
import java.applet.*;
import java.awt.*;
public class TextFieldCannotModified extends Applet
{
	TextField TextField1;
	public void init()
	{
		TextField1=new TextField("Chetan is biggest Fan of Java");
		TextField1.setEditable(false);
		add(TextField1);
	} 
}
/*<applet code="TextFieldCannotModified.class" width=1366 height=768>
</applet>*/