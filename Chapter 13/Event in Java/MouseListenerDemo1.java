/*Write a program to demonstrate MouseListener.*/
import java.awt.*;
import java.awt.event.*;
class MouseListenerDemo1 extends Frame implements MouseListener
{
	MouseListenerDemo1()
	{
		addMouseListener(this);
		setVisible(true);
		setSize(500,500);
	}
	public void mouseClicked(MouseEvent m)
	{
        setBackground(Color.RED);
		
	}
	public void mousePressed(MouseEvent m)
	{
		setBackground(Color.PINK);
	}
    public void mouseEntered(MouseEvent m)
	{
		setBackground(Color.YELLOW);
	}
	public void mouseExited(MouseEvent m)
	{
		setBackground(Color.BLACK);
	}
	public void mouseReleased(MouseEvent m)
	{
		setBackground(Color.GREEN);
	}
	public static void main(String args[])
	{
		MouseListenerDemo1 m1=new MouseListenerDemo1();
	}
}

