package hw12C;

/**LethargicCritter is a subclass of Critter
 * Eats or sleep when move is called
 * @author arlan
 *
 */
public class LethargicCritter extends Critter{
	private boolean moveStatus;
	/**Constructor that initializes weight and moveStatus
	 * 
	 * @param theWeight The weight of the critter
	 */
	public LethargicCritter(double theWeight) {
		super(theWeight);
		moveStatus = true;
	}
	@Override
	/**Alternates between eat and sleep when move is called
	 * 
	 */
	public void move(int steps) {
		if(moveStatus == true) {
			super.addHistory("eat");
			moveStatus = false;
		}else if(moveStatus == false) {
			super.addHistory("sleep");
			moveStatus = true;
		}
	}
	
	public String toString() {
		String temp = super.toString();
		temp += "[timeToEat=" + moveStatus + "]";
		return temp;
	}
	
	public boolean equals(Object otherObject) {
		if(!(otherObject instanceof LethargicCritter))
			return false;
		boolean flag = super.equals(otherObject);
		LethargicCritter other = (LethargicCritter)otherObject;
		if(moveStatus != other.moveStatus || !flag)
			return false;
		return true;
	}
}
