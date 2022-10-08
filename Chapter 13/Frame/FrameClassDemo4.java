 /*Write a program to take one label and one text field display on Frame.*/
import java.awt.*;
class FrameClassDemo4 extends Frame
{
	Label Label1;
	TextField TextField1;
	FrameClassDemo4()
	{  
		Label1=new Label("Enter the name:-");
		TextField1=new TextField(20);
		setLayout(new FlowLayout());
		add(Label1);
		add(TextField1);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String args[]) 
	{
		FrameClassDemo4 f4=new FrameClassDemo4();
	}
}