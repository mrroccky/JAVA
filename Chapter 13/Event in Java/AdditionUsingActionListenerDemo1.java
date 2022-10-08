
 */
 import java.awt.*;
 import java.awt.event.*;
class AdditionUsingActionListenerDemo1 extends Frame implements ActionListener
{
       Label Label1,Label2,Label3;
       TextField TextField1,TextField2,TextField3;
       Button Button1;
	   int a,b,c;
	   AdditionUsingActionListenerDemo1()
	   {
		   Label1=new Label("Enter the first number");
		   Label2=new Label("Enter the second number");
		   Label3=new Label("Result");

		   TextField1=new TextField(20);
		   TextField2=new TextField(20);
		   TextField3=new TextField(20);
		   Button1=new Button("calculate");
		   Button1.addActionListener(this);
		   setLayout(new FlowLayout());
		   add(Label1);
		   add(TextField1);
		   add(Label2);
		   add(TextField2);
		   add(Label3);
		   add(TextField3);
		   add(Button1);
		   setVisible(true);
		   setSize(500,500);


	   }
	   public void actionPerformed(ActionEvent e)
	   {
		   a=Integer.parseInt(TextField1.getText());
		   b=Integer.parseInt(TextField2.getText());
		   c=a+b;
		   TextField3.setText(Integer.toString(c));
	   }
	   public static void main(String args[]) 
	   {
			 AdditionUsingActionListenerDemo1 a1=new AdditionUsingActionListenerDemo1();
		}
}
