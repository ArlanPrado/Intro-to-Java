package hw11A;

/**Chips class that is a subclass of Product
 * Adds sodium initialized variable
 * @author arlan
 *
 */
public class Chips extends Product{
	private int sodium;
	public static final int IDEAL_SODIUM = 1500;

	/**Chips constructor, calls Product superclass to assign description and price
	 * 
	 * @param desc Description of Product
	 * @param price Price of Product
	 * @param sodiumAmt Amount of Sodium in each bag of Chips
	 */
	public Chips(String desc, double price, int sodiumAmt) {
		super(desc, price);
		sodium = sodiumAmt;
	}
	
	/**Returns sodium
	 * 
	 * @return sodium
	 */
	public int getSodium() {
		return sodium;
	}
	
	/**Returns the percentage of bag of chips to ideal sodium
	 * 
	 * @return percentage of bag of chips to ideal sodium amount
	 */
	public double percentOfDailyAmount() {
		double percent = ((double) sodium / IDEAL_SODIUM) * 100;
		return percent;
	}
	
	/**@Override
	 * @return description
	 */
	public String getDescription() {
		String desc = super.getDescription() + " " + sodium;
		return desc;
	}
}
