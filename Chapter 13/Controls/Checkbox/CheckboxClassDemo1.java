/*
   Write a program to demonstrate Checkbox class.
             OR
   Write a program to make check boxes for selecting your hobbies.

 */
import java.applet.*;
import java.awt.*;
public class CheckboxClassDemo1 extends Applet
{
	Checkbox Checkbox1,Checkbox2,Checkbox3,Checkbox4,Checkbox5;
	public void init()
	{
		Checkbox1=new Checkbox("Playing");
		Checkbox2=new Checkbox("Dancing");
		Checkbox3=new Checkbox("Singing");
		Checkbox4=new Checkbox("Swimming");
		Checkbox5=new Checkbox("Studying");
		add(Checkbox1);
		add(Checkbox2);
		add(Checkbox3);
		add(Checkbox4);
		add(Checkbox5);
	}
	 
}
/*<applet code="CheckboxClassDemo1.class" width=1366 height=768>
</applet>*/