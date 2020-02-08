package hw03A;

/**
 * Models a player of the game Vulcan Poker
 * @author Arlan Prado
 *
 */

public class Player {
	
	private String name;
	private int adjVal;
	
	/** Constructs a Player with a name and adjustment value
	 * 
	 * @param theName - the Name of the player
	 * @param theVal - the determined adjustment value (must be 0 to 40)
	 */
	
	public Player(String theName, int theVal) {
		name = theName;
		adjVal = theVal;
	}
	
	/** Returns the name of the player
	 * 
	 * @return name
	 */
	
	public String getName() {
		return name;
	}

	/**Returns the adjustment value of the player
	 * 
	 * @return adjVal
	 */
	
	public int getAdjustment(){
		return adjVal;
	}
	
	/**Sets a new adjustment value for the player
	 * 
	 * @param newVal
	 */
	
	public void setAdjustment(int newVal) {
		adjVal = newVal;
	}
	
	/**
	 *  @param newVal
	 */
	
}
