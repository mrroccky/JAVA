import java.awt.*;
import java.awt.event.*;
public class ScrollDemo extends Frame implements AdjustmentListener
{                  
    Scrollbar redScroll, greenScroll, blueScroll;                            
    Label redLabel, greenLabel, blueLabel;  
    Panel p1;
 
    public ScrollDemo()
    {
          setBackground(Color.yellow);  
          p1 = new Panel();
          p1.setLayout(new GridLayout(3, 2, 5, 5));  
 
          redScroll = new Scrollbar(Scrollbar.HORIZONTAL, 0, 0,  0, 255);
          redScroll.setUnitIncrement(5);                           //default is 1
          redScroll.setBlockIncrement(15);                         //default is 10
          p1.add(redLabel = new Label("RED"));  
          p1.add(redScroll);
                                                                   // similarly set for green scroll bar
          greenScroll = new Scrollbar(Scrollbar.HORIZONTAL, 0, 0, 0, 255);
          greenScroll.setUnitIncrement(5);
          greenScroll.setBlockIncrement(15);
          p1.add(greenLabel = new Label("GREEN"));
          p1.add(greenScroll);
 
          blueScroll = new Scrollbar();
          blueScroll.setOrientation(Scrollbar.HORIZONTAL);  
          blueScroll.setValue(0);
          blueScroll.setVisibleAmount(0);
          blueScroll.setUnitIncrement(5);  
          blueScroll.setBlockIncrement(10);
          blueScroll.setMinimum(0);
          blueScroll.setMaximum(255);
          p1.add(blueLabel = new Label("BLUE"));
          p1.add(blueScroll);
 
          redScroll.addAdjustmentListener(this);
          greenScroll.addAdjustmentListener(this);
          blueScroll.addAdjustmentListener(this);
 
          add(p1,"South");
 
          setTitle("Playing With Colors");
          setSize(450,325);
          setVisible(true);
      }
 
      public Insets getInsets()  
      {
         Insets is1 = new Insets(5, 8, 10, 25);
         return is1;
      }
      
      public void adjustmentValueChanged(AdjustmentEvent e)
      {
         int rv = redScroll.getValue();  
         int gv = greenScroll.getValue();
         int bv = blueScroll.getValue();
 
        redLabel.setText("RED: "+ rv);
        greenLabel.setText("GREEN: "+ gv);
        blueLabel.setText("BLUE: "+ bv);
 
       Color clr1 = new Color(rv, gv, bv);
       setBackground(clr1);
     }
     public static void main(String args[])
     {
         new ScrollDemo();
     }
}