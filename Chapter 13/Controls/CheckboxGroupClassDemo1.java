import java.applet.*;
import java.awt.*;
public class CheckboxGroupClassDemo1 extends Applet
{
	Checkbox Checkbox1,Checkbox2;
	CheckboxGroup CheckboxGroup1,CheckboxGroup2;
	public void init()
	{
		CheckboxGroup1=new CheckboxGroup();
		CheckboxGroup2=new CheckboxGroup();
		Checkbox1=new Checkbox("Male",CheckboxGroup1,true);
		Checkbox2=new Checkbox("Female",CheckboxGroup2,false);
		add(Checkbox1);
		add(Checkbox2);
	}
	 
}
/*<applet code="CheckboxGroupClassDemo1.class" width=1366 height=768>
</applet>*/