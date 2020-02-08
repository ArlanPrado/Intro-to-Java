package hw02C;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class ConcentricComponent extends JComponent{
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
				
		Ellipse2D bigCircle = new Ellipse2D.Double(55, 55, 90, 90);
		g2.setColor(Color.RED);
		g2.fill(bigCircle);
		
		Ellipse2D midCircle = new Ellipse2D.Double(70, 70, 60, 60);
		g2.setColor(Color.WHITE);
		g2.fill(midCircle);
	
		Ellipse2D smallCircle = new Ellipse2D.Double(85, 85, 30, 30);
		g2.setColor(Color.RED);
		g2.fill(smallCircle);
	}
}

