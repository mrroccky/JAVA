/* Write a program to demonstrate constructors of Label class.*/
import java.applet.*;
import java.awt.*;
public class LabelClassConstructorsDemo extends Applet
{
	Label Label1,Label2,Label3;
	public void init()
	{
		Label1=new Label();
		Label2=new Label("Label with String Constructor");
		Label3=new Label("Label with String Constructor and also with Alignment",Label.CENTER);
		add(Label1);
		add(Label2);
		add(Label3);
	}
	 
}
/*<applet code="LabelClassConstructorsDemo.class" width=1366 height=768>
</applet>*/