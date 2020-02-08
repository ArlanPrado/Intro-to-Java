package hw08a;
import java.awt.Rectangle;
/**A class that gets a reference to a rectangle array to access or manipulate rectangle objects
 * 
 * @author arlan
 *
 */
public class Rectangles {

		private Rectangle[] recArray;
		
	/**Constructs a reference to the rectangle array in the parameter
	 * 
	 * @param recArray original array
	 */
	public Rectangles(Rectangle[] recArray) {
		this.recArray = recArray;
	}
	
	/**Gets the average area of all the rectangle objects in the rectangle array
	 * 
	 * @return average area of the rectangles
	 */
	public double averageArea() {
		double sumArea=0;
		int counter=0;
		for(Rectangle element : recArray )
		{
			sumArea += element.getHeight() * element.getWidth();
			counter++;
		}
		return sumArea/counter;
	}
	
	/**Identifies the maximum and the minimum areas of the rectangle array and swaps them
	 * 
	 */
	public void swapMaxAndMin() {
		double tempArea;
		double areaLg = 0;
		int posLg =0;
		double areaSm =0;
		int posSm =0;
		for(int i=0; i<recArray.length; i++) {
			tempArea = recArray[i].getWidth()*recArray[i].getHeight();
			if(i==0)
				areaSm = areaLg = tempArea;
			else if(tempArea > areaLg) {
				areaLg = tempArea;
				posLg = i;				
			}
			else if (tempArea < areaSm) {
				areaSm = tempArea;
				posSm = i;
			}
		}
		Rectangle temp;
		temp = recArray[posLg];
		recArray[posLg] = recArray[posSm];
		recArray[posSm] = temp;
	}
	
	/**Gets each element of the rectangle array and puts them into a string
	 * 
	 * @return rect The rectangle array in string form
	 */
	public String toString() {
		String rect = "";
		for(int i=0; i<recArray.length; i++) {
			if(i==0)
				rect += "[" + recArray[i].toString();
			else if(i==recArray.length-1)
				rect += ", " + recArray[i].toString()+ "]";
			else if(i>0)
				rect += ", " + recArray[i].toString();
		}
		return rect;			
	}
}
