/*Write a program to make menu bar having File and Edit menu.*/
import java.awt.*;
class MenuBarDemo1 extends Frame
{
    MenuBar MenuBar1;	
	Menu FileMenu,EditMenu;
	MenuBarDemo1()
	{  
		MenuBar1=new MenuBar();
		FileMenu=new Menu("File");
		EditMenu=new Menu("Edit");
		MenuBar1.add(FileMenu);
		MenuBar1.add(EditMenu);
		setMenuBar(MenuBar1);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String args[]) 
	{
		MenuBarDemo1 m1=new MenuBarDemo1();
	}
}