package hw02;

import javax.swing.*;

public class StripesViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 400);
      frame.setTitle("Stripes");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      StripesComponent component = new StripesComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}