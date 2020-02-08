package hw02B;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class TwoForTheShowComponent extends JComponent{
	private static final long serialVersionUID = 1L;
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		// Letter T
		Line2D segmentT1 = new Line2D.Double(20, 50, 60, 50);
		g2.setColor(Color.RED);
		g2.draw(segmentT1);
		
		Line2D segmentT2 = new Line2D.Double(40, 50, 40, 100);
		g2.draw(segmentT2);
		
		// Letter W
		Line2D segmentW1 = new Line2D.Double(70, 50, 80, 100);
		g2.setColor(Color.BLUE);
		g2.draw(segmentW1);
		
		Line2D segmentW2 = new Line2D.Double(80, 100, 90, 50);
		Line2D segmentW3 = new Line2D.Double(90, 50, 100, 100);
		Line2D segmentW4 = new Line2D.Double(100, 100, 110, 50);
		g2.draw(segmentW2);
		g2.draw(segmentW3);
		g2.draw(segmentW4);
		
		// Letter O
		Ellipse2D letterO = new Ellipse2D.Double(120, 50, 40, 50);
		Color custom = new Color(200, 255, 10);
		g2.setColor(custom);
		g2.fill(letterO);
	}
}
