package hw10C;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**Traffic Light class that draws the Traffic Light using Graphics2D
 * 
 * @author arlan
 *
 */
public class TrafficLight{
	
	private int x;
	private int y;
	private int light;
	public static final int RED = 1;
	public static final int GREEN = 2;
	public static final int YELLOW = 3;
	
	/**Constructor that sets the x and y by the parameters and sets light default to red
	 * 
	 * @param x X Coordinate
	 * @param y Y Coordinate
	 */
	public TrafficLight(int x, int y) {
		this.x = x;
		this.y = y;
		light = RED;
		
	}
	
	/**Changes the light by checking what it is initially is
	 * 
	 */
	public void cycle() {
		if(light == RED)
			light = GREEN;
		else if(light == GREEN)
			light = YELLOW;
		else if(light == YELLOW)
			light = RED;
	}
	
	/**Returns the status of the light in a String
	 * 
	 * @return the String of what the light is
	 */
	public String getLight() {
		if(light == RED)
			return "red";
		else if(light == GREEN)
			return "green";
		else 
			return "yellow";
	}
	
	/**Draws a default TrafficLight first then overlays the right light onto its corresponding spot
	 * 
	 * @param g2 Graphics2D
	 */
	public void draw(Graphics2D g2) {
		Rectangle trafficBox = new Rectangle(x, y, 20, 60);
		g2.setColor(Color.BLACK);
		g2.draw(trafficBox);
		Ellipse2D circle = new Ellipse2D.Double(x, y, 20, 20);
		Color offRed = new Color(128,00,00);
		g2.setColor(offRed);
		g2.fill(circle);
		circle.setFrame(x, y+20, 20, 20);
		Color offYellow = new Color(255,165,00);
		g2.setColor(offYellow);
		g2.fill(circle);
		circle.setFrame(x, y+40, 20, 20);
		Color offGreen = new Color(85,107,47);
		g2.setColor(offGreen);
		g2.fill(circle);
		
		if(light == RED) {
			circle.setFrame(x, y, 20, 20);
			g2.setColor(Color.RED);
			g2.fill(circle);
		} else if(light == YELLOW) {
			circle.setFrame(x, y+20, 20, 20);
			g2.setColor(Color.YELLOW);
			g2.fill(circle);
		} else if(light == GREEN) {
			circle.setFrame(x, y+40, 20, 20);
			g2.setColor(Color.GREEN);
			g2.fill(circle);
		}
		g2.setColor(Color.BLACK);
	}
}
