/*Write a program to take one label, one text field and Button display on Frame.*/
import java.awt.*;
class FrameClassDemo5 extends Frame
{
	Label Label1;
	TextField TextField1;
	Button Button1;
	FrameClassDemo5()
	{  
		Label1=new Label("Enter the name:-");
		TextField1=new TextField(20);
		Button1=new Button("Ok");
		setLayout(new FlowLayout());
		add(Label1);
		add(Button1);
		add(TextField1);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String args[]) 
	{
		FrameClassDemo5 f5=new FrameClassDemo5();
	}
}