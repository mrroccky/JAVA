/* Write a program to create Frame and set Title of Frame.*/
import java.awt.*;
class FrameClassDemo2 extends Frame
{
	FrameClassDemo2()
	{  
		setTitle("Frame is created By Chetan");
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String args[]) 
	{
		FrameClassDemo2 f2=new FrameClassDemo2();
	}
}