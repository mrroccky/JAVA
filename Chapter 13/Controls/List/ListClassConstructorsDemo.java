/*Write a program to demonstrate constructors of List class. */
import java.applet.*;
import java.awt.*;
public class ListClassConstructorsDemo extends Applet
{
	List List1,List2,List3;
	public void init()
	{
		List1=new List();
		List2=new List(2);
		List3=new List(3,true);

		List1.add("1");
		List1.add("2");
		List1.add("3");

		List2.add("4");
		List2.add("5");
		List2.add("6");
		List2.add("7");
		List2.add("8");
		List2.add("9");

		List3.add("10");
		List3.add("11");
        List3.add("12");
		List3.add("13");
		List3.add("14");
		List3.add("15");



		add(List1);
		add(List2);
		add(List3);
	}
	 
}
/*<applet code="ListClassConstructorsDemo.class" width=1366 height=768>
</applet>*/