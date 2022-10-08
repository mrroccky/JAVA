/* 
  Write a program to change the background Color of Applet.
                    OR
  Write a program to demonstrate setBackground method of Applet.
 */
import java.awt.*;
import java.applet.*;
public class AppletBackgroundChangeColor2 extends Applet 
{ 	 
     public void paint(Graphics g)
	 {
		 setBackground(Color.red);
	 }

}
/*
<applet code="AppletBackgroundChangeColor2.class" width=1000 height=500>
</applet>
*/