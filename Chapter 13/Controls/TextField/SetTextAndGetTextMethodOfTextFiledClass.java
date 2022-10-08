import java.applet.*;
import java.awt.*;
public class SetTextAndGetTextMethodOfTextFiledClass extends Applet
{
	TextField TextField1,TextField2;
	public void init()
	{
		TextField1=new TextField();
		TextField2=new TextField("TextField with constructor");
		TextField1.setText("TextField1");
		System.out.println("Text in TextField2 is="+TextField1.getText());
		add(TextField1);
		add(TextField2);
	} 
}
/*<applet code="SetTextAndGetTextMethodOfTextFiledClass.class" width=1366 height=768>
</applet>*/