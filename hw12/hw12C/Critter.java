package hw12C;

import java.util.ArrayList;

/**
 * A simulated critter.
 */
public class Critter
{
    private int position;
    private double weight;
    private ArrayList<String> history;

    /**
    Constructs a critter at position 0 with blank history.
     */
    public Critter(double theWeight)
    {
        position = 0;
        weight = theWeight;
        history = new ArrayList<String>();
    }

    /**
    Gets the history of this critter.
    @return the history
     */
    public ArrayList<String> getHistory()
    {
        return history;
    }

    /**
    Adds to the history of this critter.
    @param event the event to add to the history
     */
    public void addHistory(String event)
    {
        history.add(event);
    }

    /**
    Gets the position of this critter.
    @return the position
     */
    public int getPosition()
    {
        return position;
    }

    /**
    Moves this critter.
    @param steps the number of steps by which to move.
     */
    public void move(int steps)
    {
        position = position + steps;
        addHistory("move to " + position);
    }

    public double getWeight()
    {
        return weight;
    }
    
    public String toString() {
    	String temp = "";
    	if(this instanceof LethargicCritter)
    		temp += "LethargicCritter";
    	else if(this instanceof Critter)
    		temp += "Critter";
    	temp += "[position=" + position + ",weight=" + weight +  ",history=" + history.toString() + "]";
    	return temp;
    }
    
    public boolean equals(Object otherObject) {
    	if(!(otherObject instanceof Critter))
    		return false;
    	if(this instanceof LethargicCritter && otherObject instanceof LethargicCritter || !(this instanceof LethargicCritter) && !(otherObject instanceof LethargicCritter)) {
    		Critter other = (Critter)otherObject;
    		if(history.size() != other.history.size() || position != other.position || weight != other.weight)
    			return false;
    		for(int i=0; i<history.size(); i++) {
    			if(history.get(i).equals(other.history.get(i)))
    				return false;
    		}
    		return true;
    	}
    	return false;
    }

}