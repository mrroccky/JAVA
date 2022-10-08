 /*Write a program to perform Arithmetic operations of enter two numbers and display result in Dialog box.*/
import javax.swing.*;
class ArithmeticOperationUsingDialogBox
{
	public static void main(String args[]) 
	{
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		JOptionPane.showMessageDialog(null,"Addition is="+(a+b),"ResultBox",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Subtraction is="+(a-b),"ResultBox",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Multiplication is="+(a*b),"ResultBox",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Division is="+(a/b),"ResultBox",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Mod is="+(a%b),"ResultBox",JOptionPane.INFORMATION_MESSAGE);

	}
}
