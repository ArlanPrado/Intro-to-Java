package hw02;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class StripesComponent extends JComponent
{

   private static final long serialVersionUID = 1L;
   
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
     
      Rectangle redBox = new Rectangle(0, 0, 150, 30);
      g2.setColor(Color.RED);
      g2.fill(redBox);
      
      Rectangle orangeBox = new Rectangle(0, 30, 150, 30);
      g2.setColor(Color.ORANGE);
      g2.fill(orangeBox);
   
      Rectangle yellowBox = new Rectangle(0, 60, 150, 30);
      g2.setColor(Color.YELLOW);
      g2.fill(yellowBox);
      
      Rectangle greenBox = new Rectangle(0, 90, 150, 30);
      g2.setColor(Color.GREEN);
      g2.fill(greenBox);
      
      Rectangle blueBox = new Rectangle(0, 120, 150, 30);
      g2.setColor(Color.BLUE);
      g2.fill(blueBox);
      
      Rectangle indigoBox = new Rectangle(0, 150, 150, 30);
      Color indigo = new Color(75, 0, 130);
      g2.setColor(indigo);
      g2.fill(indigoBox);
      
      Rectangle violetBox = new Rectangle(0, 180, 150, 30);
      Color violet = new Color(143, 0 ,255);
      g2.setColor(violet);
      g2.fill(violetBox);
   }

    
}