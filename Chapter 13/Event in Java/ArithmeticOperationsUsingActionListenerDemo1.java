/*
   Write a program to take two labels these are enter the first number and enter the second 
   number an also two text field with calculate button and perform Arithmetic operations of 
   them display result in third text field.

*/
import java.awt.*;
import java.awt.event.*;
class ArithmeticOperationsUsingActionListenerDemo1 extends Frame implements ActionListener
{
       Label Label1,Label2,Label3;
       TextField TextField1,TextField2,TextField3;
       Button AdditionButton,SubtractionButton,MutiplicationButton,DivisionButton;
	   int a,b,c;
	   ArithmeticOperationsUsingActionListenerDemo1()
	   {
		   Label1=new Label("Enter the first number");
		   Label2=new Label("Enter the second number");
		   Label3=new Label("Result");

		   TextField1=new TextField(20);
		   TextField2=new TextField(20);
		   TextField3=new TextField(20);

		   AdditionButton=new Button("Addition");
		   SubtractionButton=new Button("Subtraction");
		   MutiplicationButton=new Button("Mutiplication");
		   DivisionButton=new Button("Division");

		   AdditionButton.addActionListener(this);
		   SubtractionButton.addActionListener(this);
		   MutiplicationButton.addActionListener(this);
		   DivisionButton.addActionListener(this);

		   setLayout(new FlowLayout());
		   add(Label1);
		   add(TextField1);
		   add(Label2);
		   add(TextField2);
		   add(Label3);
		   add(TextField3);
		   add(AdditionButton);
		   add(SubtractionButton);
		   add(MutiplicationButton);
		   add(DivisionButton);
		   setVisible(true);
		   setSize(500,500);


	   }
	   public void actionPerformed(ActionEvent e)
	   {
		   a=Integer.parseInt(TextField1.getText());
		   b=Integer.parseInt(TextField2.getText());

		   if(e.getSource()==AdditionButton)
		   {
			   c=a+b;
		       TextField3.setText(Integer.toString(c));
		   }
		   else if(e.getSource()==SubtractionButton)
		   {
			   c=a-b;
		       TextField3.setText(Integer.toString(c));
		   }
		   else if(e.getSource()==MutiplicationButton)
		   {
			   c=a*b;
		       TextField3.setText(Integer.toString(c));
		   }
		   else
		   {
			   c=a/b;
		       TextField3.setText(Integer.toString(c));
		   }
	   }
	   public static void main(String args[]) 
	   {
			 ArithmeticOperationsUsingActionListenerDemo1 a1=new ArithmeticOperationsUsingActionListenerDemo1();
	   }
}
