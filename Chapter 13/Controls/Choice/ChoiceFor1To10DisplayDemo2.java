/*Write a program to display 1 to 10 in choice (drop down list).*/
import java.applet.*;
import java.awt.*;
public class ChoiceFor1To10DisplayDemo2 extends Applet
{
	Choice Choice1;
	int i=1;
	public void init()
	{
		Choice1=new Choice();
		for(i=1;i<=10;i++)
		{
			Choice1.add(Integer.toString(i));
		} 
		add(Choice1);
	} 
}
/*<applet code="ChoiceFor1To10DisplayDemo2.class" width=1366 height=768>
</applet>*/