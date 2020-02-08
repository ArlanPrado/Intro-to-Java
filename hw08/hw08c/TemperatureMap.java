package hw08c;

import java.awt.*;

public class TemperatureMap {
	private int[][] tempMap;
	private static final int SQ_AREA = 20;
	
	public TemperatureMap(int[][] tempMap) {
		this.tempMap = tempMap;
	}
	public void drawMap (Graphics2D g2) {
		Rectangle box;
		for(int column=0; column< SQ_AREA; column++) {
			for(int row=0; row < SQ_AREA; row++) {
				box = new Rectangle(column*10, row*10, 10, 10);
				g2.setColor(getColor(row,column));
				g2.fill(box);
			}
		}
	}
	private Color getColor(int row, int column) {
		int temp = tempMap[row][column];
		if(temp <= 32)
			return Color.BLUE;
		else if(temp <= 50)
			return Color.GREEN;
		else if(temp <= 85)
			return Color.ORANGE;
		else
			return Color.RED;
	}
	public int maxDifference() {
		int max = tempMap[0][0], min = tempMap[0][0];
		for(int row=0; row < SQ_AREA; row++) {
			for(int column=0; column < SQ_AREA; column++) {
				if(max < tempMap[row][column])
					max = tempMap[row][column];
				else if(min > tempMap[row][column])
					min = tempMap[row][column];
			}
		}
		return max-min;
	}
}
