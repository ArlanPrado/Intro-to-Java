package hw07B;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class NightSkyComponent extends JComponent
{

   private static final long serialVersionUID = 1L;
   
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
    
      NightSky sky = new NightSky();
      sky.draw(g2);
      
      g2.drawString("The Night Sky", 50, 330);
   }
    
}