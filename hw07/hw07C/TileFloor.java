package hw07C;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;
/**
 * Describes a mosaic table top
 */
public class TileFloor
{
    public static final int RED = 0;
    public static final int GREEN = 1;
    public static final int BLUE = 2;
    public static final int BLACK = 3;
    public static final int CYAN = 4;
    
    public static final int GAP = 3;
    public static final int SIDE = 10;
    public static final int DEFAULT_ROWS = 8;
    public static final int DEFAULT_COLUMNS = 6;
    
    private Random random;
    private int x;
    private int y;
    
    //must be initialized in the constructors
    private  final int ROWS;
    private  final int COLUMNS;
    
    
    
    /**
     * Models a tile floor with upper left hand corner at x, y and square tiles with side of 10 with the 
     * default number of rows and columns
     * @param x the x coordinate of the upper left hand corner of the table top
     * @param y the x coordinate of the upper left hand corner of the table top
     */
    public TileFloor(int x, int y)
    {
        random = new Random(12345);
        this.x=x;
        this.y=y;
        COLUMNS = DEFAULT_COLUMNS;
        ROWS = DEFAULT_ROWS;
    }
    
    /**
     * Models a tile floor with upper left hand corner at x, y and square tiles with side of 10.
     * @param x the x coordinate of the upper left hand corner of the table top
     * @param y the x coordinate of the upper left hand corner of the table top
     * @param rows the number of rows in this TileFloor
     * @param columns the number of squares in each row of this TileFloor
     */
    public TileFloor( int x, int y, int rows, int columns)
    {
        random = new Random(12345);
        this.x=x;
        this.y=y;
        ROWS = rows;
        COLUMNS = columns;
        
    }
    
    /**
     * Sets a new x for  the table top
     * @param x the new x coordinate of this object.
     */
    public void setX(int x)
    {
        this.x = x;
    }
    
    /**
     * Sets a new y for  the table top
     * @param theY the new y coordinate of this object.
     */
    public void setY(int theY)
    {
        y = theY;
    }
    
    public void draw(Graphics2D g2) {
    	Rectangle tile = new Rectangle(x, y, 10, 10);
    	int newX = x, newY = y;
    	for(int i=1; i<ROWS; i++) {
    		for(int j=1; j<COLUMNS; j++) {
    			g2.setColor(randomColor());
    			g2.fill(tile);
    			newX = newX+13;
    			tile = new Rectangle(newX, newY, 10, 10);
    		}
    		g2.setColor(randomColor());
			g2.fill(tile);
			newX = x;
			newY=newY+13;
			tile = new Rectangle(newX, newY, 10, 10);
    	}
    	
    }
    
    private Color randomColor() {
    	int rando = random.nextInt(5);
    	if(rando==RED)
    		return Color.RED;
    	else if(rando==GREEN)
    		return Color.GREEN;
    	else if(rando==BLUE)
    		return Color.BLUE;
    	else if(rando==BLACK)
    		return Color.BLACK;
    	else
    		return Color.CYAN;
    }
}  