package hw07B;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import java.util.Random;

/**
 * An class that can draw a night sky with stars and a moon
 */
public class NightSky
{
	private Random gen;
	final int MAX_X = 400;
	final int MAX_Y = 300;
	final int MIN_X = 0;
	final int MIN_Y = 0;
	final int NUMBER_OF_STARS = 50;
	final int DIAMETER_OF_STAR = 3;
	final int DIAMETER_OF_MOON = 20;
	
	public NightSky()
	{
		gen = new Random(98745678);
	}

	public void draw(Graphics2D g2)
	{
		int x, y;
		int yMin = 300;
		Rectangle sky = new Rectangle(0,0,400,300);
		g2.setColor(Color.DARK_GRAY);
		g2.fill(sky);
		Ellipse2D.Double minStar = new Ellipse2D.Double(0, MAX_Y, 0, 0);  
		for(int i=0; i<=50; i++) {
			x = gen.nextInt(400);
			y = gen.nextInt(300);
			
			Ellipse2D.Double star = new Ellipse2D.Double(x, y, DIAMETER_OF_STAR, DIAMETER_OF_STAR);
			g2.setColor(Color.WHITE);
			g2.fill(star);
			if(y < yMin) {
				yMin = y;
				minStar = star;
			}
		}
		x = (int) minStar.getX();
		y = (int) minStar.getY();
		
		Ellipse2D.Double moon = new Ellipse2D.Double(x, y, DIAMETER_OF_MOON, DIAMETER_OF_MOON);
		g2.setColor(Color.LIGHT_GRAY);
		g2.fill(moon);
		
		
		
		   
	}
}