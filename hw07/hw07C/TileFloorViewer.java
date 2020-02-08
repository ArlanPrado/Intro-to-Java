package hw07C;

import javax.swing.*;
public class TileFloorViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 400);
      frame.setTitle("TileFloor");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      TileFloorComponent component = new TileFloorComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}