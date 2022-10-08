/*Write a program to demonstrate setText and getText method of Label class.*/
import java.applet.*;
import java.awt.*;
public class SetTextAndGetTextMethodOfLabelClass extends Applet
{
	Label Label1,Label2,Label3;
	public void init()
	{
		Label1=new Label();
		Label2=new Label("Label with String Constructor");
		Label1.setText("Default Constructor of Label Class");
		System.out.println("String in Label2 is="+Label2.getText());
		add(Label1);
		add(Label2);
	}
	 
}
/*<applet code="SetTextAndGetTextMethodOfLabelClass.class" width=1366 height=768>
</applet>*/