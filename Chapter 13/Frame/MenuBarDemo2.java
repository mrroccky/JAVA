/*Write a program to make menu bar having File Menu in File menu there is New and Open menu items.*/
import java.awt.*;
class MenuBarDemo2 extends Frame
{
    MenuBar MenuBar1;	
	Menu FileMenu;
	MenuItem NewMenuItem,OpenMenuItem;
	MenuBarDemo2()
	{  
		MenuBar1=new MenuBar();
		FileMenu=new Menu("File");

		NewMenuItem=new MenuItem("New");
		OpenMenuItem=new MenuItem("Open");

		FileMenu.add(NewMenuItem);
		FileMenu.add(OpenMenuItem);
		MenuBar1.add(FileMenu);
		setMenuBar(MenuBar1);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String args[]) 
	{
		MenuBarDemo2 m2=new MenuBarDemo2();
	}
}