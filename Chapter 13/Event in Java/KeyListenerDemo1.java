/*Write a program to demonstrate KeyListener.*/
import java.awt.*;
import java.awt.event.*;
class KeyListenerDemo1 extends Frame implements KeyListener
{
	TextField TextField1;
	KeyListenerDemo1()
	{
		TextField1=new TextField(20);
		setLayout(new FlowLayout());
		add(TextField1);
		TextField1.addKeyListener(this);
		setVisible(true);
		setSize(500,500);
	}
	public void keyTyped(KeyEvent e)
	{
		System.out.println("Key  is Typed");
	}
	public void keyPressed(KeyEvent e)
	{
		System.out.println("Key  is Pressed");
	}
	public void keyReleased(KeyEvent e)
	{
		System.out.println("Key  is Released");
	}
    public static void main(String args[]) 
	{
		KeyListenerDemo1 k1=new KeyListenerDemo1();
	}
}