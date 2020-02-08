package hw02C;

import javax.swing.*;
public class ConcentricViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(200,250);
      frame.setTitle("Concentric Circles");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      ConcentricComponent component =  new ConcentricComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}