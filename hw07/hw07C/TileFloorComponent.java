package hw07C;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class TileFloorComponent extends JComponent
{

   private static final long serialVersionUID = 1L;
   
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
    
      TileFloor floor = new TileFloor(15, 20);
      floor.draw(g2);
      
      floor.setX(100);
      floor.setY(50);
      floor.draw(g2);
    
      floor = new TileFloor(50, 200, 10, 12);
      floor.draw(g2);
   }

    
}