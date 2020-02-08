package hw02B;

import javax.swing.*;

public class TwoForTheShowViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 400);
      frame.setTitle("Two For The Show");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      TwoForTheShowComponent component = new TwoForTheShowComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}