/* Write a program to change background color of Applet use Color class to change color.*/
import java.awt.*;
import java.applet.*;
public class AppleBackgroundChangeColorUsingColorClass extends Applet 
{ 	 
     public void init()
	 {
		 setBackground(new Color(255,0,0));
	 }

}
/*
<applet code="AppleBackgroundChangeColorUsingColorClass.class" width=1000 height=500>
</applet>
*/