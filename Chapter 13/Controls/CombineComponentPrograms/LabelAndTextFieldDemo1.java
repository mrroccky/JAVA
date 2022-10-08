/*
   Write a program to print following output.
                    _______________________  
   Enter the Name  |_______________________|
*/
import java.applet.*;
import java.awt.*;
public class LabelAndTextFieldDemo1 extends Applet
{
	Label Label1;
	TextField TextField1;
	public void init()
	{ 
		Label1=new Label("Enter the Name");
		TextField1=new TextField(20);
		add(Label1);
		add(TextField1);
	}
	 
}
/*<applet code="LabelAndTextFieldDemo1.class" width=1366 height=768>
</applet>*/