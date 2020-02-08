package hw03B;

/** Counter class that tallies up the yes and no votes and returns the amount of either yes or no votes.
 * 
 * @author Arlan Prado
 *
 */
public class Counter {
	private int yes;
	private int no;
	
	/** Initializes the yes and no count to 0
	 * 
	 */
	public Counter() {
		yes = 0;
		no = 0;
	}
	
	/** Adds 1 to the Yes votes 
	 * 
	 */
	public void voteYes() {
		yes = yes + 1;
	}
	
	/** Adds 1 to the No votes 
	 * 
	 */
	public void voteNo() {
		no = no + 1;
	}
	
	/** Returns the yes votes
	 * 
	 * @return yes Number of total yes votes
	 */
	public int getYesVotes(){
		return yes;
	}
	
	/** Returns the no votes
	 * 
	 * @return no Number of total no votes
	 */
	public int getNoVotes() {
		return no;
	}
}
