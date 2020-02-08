package hw07B;

import javax.swing.*;
public class NightSkyViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 400);
      frame.setTitle("Night Sky");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JComponent component = new NightSkyComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}