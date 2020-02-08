package hw03C;
/**CityBus that tracks the direction, numberofStops, and distance from the start and end for the route
 * 
 * @author Arlan Prado
 *
 */
public class CityBus {
	private int direction; // +1 towards end ; -1 towards start
	private int stopsNum; // the number stop the bus is at
	
	/**Default constructor that sets the direction forward (+1)
	 * and sets the stop the city bus at 0
	 */
	public CityBus() {
		direction = 1;
		stopsNum = 0;
	}
	
	/**Tracks how the CityBus moves that will add to the number of stops depending on the direction
	 * 
	 * @param numberOfStops the number of stops that the CityBus is adding
	 */
	public void move(int numberOfStops) {
		stopsNum += direction * numberOfStops;
	}
	
	/**Changes the direction by multiplying the direction by -1
	 * 
	 */
	public void turn() {
		direction = direction * -1;
	}
	
	/**Gets the distance between the CityBus and the start of the route
	 * 
	 * @return startDistance - distance between start and CityBus
	 */
	public int distanceToStart() {
		int startDistance;
		startDistance = stopsNum * 5;
		return startDistance;
	}
	
	/** Gets the distance between the CityBus and the end of the route
	 * 
	 * @return endDistance - distance between the end distance and CityBus
	 */
	public int distanceToEnd() {
		int endDistance;
		endDistance = 50 - (stopsNum * 5);
		return endDistance;
	}
}
