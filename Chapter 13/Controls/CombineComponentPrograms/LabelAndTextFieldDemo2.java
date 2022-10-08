/*
   Write a program to print following output.
                        _______________________  
   Enter the Name      |_______________________|
                        ________________________     
   Enter the address   |_______________________ |
                        _________________________
   Enter the Mobile    |________________________|

*/
import java.applet.*;
import java.awt.*;
public class LabelAndTextFieldDemo2 extends Applet
{
	Label Label1,Label2,Label3;
	TextField TextField1,TextField2,TextField3;
	public void init()
	{ 
		Label1=new Label("Enter the Name");
		Label2=new Label("Enter the Address");
		Label3=new Label("Enter the Mobile");
		TextField1=new TextField(20);
		TextField2=new TextField(20);
		TextField3=new TextField(20);

		add(Label1);
		add(TextField1);
		add(Label2);
		add(TextField2);
		add(Label3);
		add(TextField3);

	}
	 
}
/*<applet code="LabelAndTextFieldDemo2.class" width=1366 height=768>
</applet>*/