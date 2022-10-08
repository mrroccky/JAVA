/*Write a program to perform Addition of enter two numbers and display result in Dialog box.*/
import javax.swing.*;
class AdditionUsingDialogBox
{
	public static void main(String args[]) 
	{
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=a+b;
		JOptionPane.showMessageDialog(null,"Addition is="+c,"Result Box",JOptionPane.INFORMATION_MESSAGE);
	}
}
