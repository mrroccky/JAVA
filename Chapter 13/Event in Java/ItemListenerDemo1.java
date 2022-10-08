/*Write a program to demonstrate ItemListener.*/
import java.awt.*;
import java.awt.event.*;
class ItemListenerDemo1 extends Frame implements ItemListener
{
	Choice Choice1;
	Label Label1;
	ItemListenerDemo1()
	{
	   Label1=new Label();
       Choice1=new Choice();
	   Choice1.add("C lang");
	   Choice1.add("C++");
	   Choice1.add("Core Java");
	   Choice1.add("Advance Java");
	   Choice1.add(".net");
	   Choice1.add("Python");
	   Choice1.add("Scala");
	   Choice1.add("PERL");
	   Choice1.add("PHP");
	   Choice1.add("Ruby");
	   setLayout(new FlowLayout());
	   
	   add(Choice1);
	   add(Label1);
	   
	   Choice1.addItemListener(this);
	   setVisible(true);
	   setSize(1368,768);
	}
	public void itemStateChanged(ItemEvent e)
	{
		Label1.setText("You selected  "+Choice1.getSelectedItem());
	}
    public static void main(String args[]) 
	{
		ItemListenerDemo1 i1=new ItemListenerDemo1();
	 }
}





